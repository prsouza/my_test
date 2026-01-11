package io.sentry;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Queue;

final class CircularFifoQueue<E> extends AbstractCollection<E> implements Queue<E>, Serializable {
    private static final long serialVersionUID = -8423413834657610406L;
    /* access modifiers changed from: private */
    public transient E[] elements;
    /* access modifiers changed from: private */
    public transient int end;
    /* access modifiers changed from: private */
    public transient boolean full;
    /* access modifiers changed from: private */
    public final int maxElements;
    /* access modifiers changed from: private */
    public transient int start;

    public CircularFifoQueue() {
        this(32);
    }

    public CircularFifoQueue(int i) {
        this.start = 0;
        this.end = 0;
        this.full = false;
        if (i > 0) {
            this.elements = new Object[i];
            this.maxElements = i;
            return;
        }
        throw new IllegalArgumentException("The size must be greater than 0");
    }

    public CircularFifoQueue(Collection<? extends E> collection) {
        this(collection.size());
        addAll(collection);
    }

    /* access modifiers changed from: private */
    public int decrement(int i) {
        int i10 = i - 1;
        return i10 < 0 ? this.maxElements - 1 : i10;
    }

    /* access modifiers changed from: private */
    public int increment(int i) {
        int i10 = i + 1;
        if (i10 >= this.maxElements) {
            return 0;
        }
        return i10;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.elements = new Object[this.maxElements];
        int readInt = objectInputStream.readInt();
        for (int i = 0; i < readInt; i++) {
            this.elements[i] = objectInputStream.readObject();
        }
        this.start = 0;
        boolean z = readInt == this.maxElements;
        this.full = z;
        if (z) {
            this.end = 0;
        } else {
            this.end = readInt;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    public boolean add(E e10) {
        Objects.requireNonNull(e10, "Attempted to add null object to queue");
        if (isAtFullCapacity()) {
            remove();
        }
        E[] eArr = this.elements;
        int i = this.end;
        int i10 = i + 1;
        this.end = i10;
        eArr[i] = e10;
        if (i10 >= this.maxElements) {
            this.end = 0;
        }
        if (this.end == this.start) {
            this.full = true;
        }
        return true;
    }

    public void clear() {
        this.full = false;
        this.start = 0;
        this.end = 0;
        Arrays.fill(this.elements, (Object) null);
    }

    public E element() {
        if (!isEmpty()) {
            return peek();
        }
        throw new NoSuchElementException("queue is empty");
    }

    public E get(int i) {
        int size = size();
        if (i < 0 || i >= size) {
            throw new NoSuchElementException(String.format("The specified index (%1$d) is outside the available range [0, %2$d)", new Object[]{Integer.valueOf(i), Integer.valueOf(size)}));
        }
        return this.elements[(this.start + i) % this.maxElements];
    }

    public boolean isAtFullCapacity() {
        return size() == this.maxElements;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean isFull() {
        return false;
    }

    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int index;
            private boolean isFirst;
            private int lastReturnedIndex = -1;

            {
                this.index = CircularFifoQueue.this.start;
                this.isFirst = CircularFifoQueue.this.full;
            }

            public boolean hasNext() {
                return this.isFirst || this.index != CircularFifoQueue.this.end;
            }

            public E next() {
                if (hasNext()) {
                    this.isFirst = false;
                    int i = this.index;
                    this.lastReturnedIndex = i;
                    this.index = CircularFifoQueue.this.increment(i);
                    return CircularFifoQueue.this.elements[this.lastReturnedIndex];
                }
                throw new NoSuchElementException();
            }

            public void remove() {
                int i = this.lastReturnedIndex;
                if (i == -1) {
                    throw new IllegalStateException();
                } else if (i == CircularFifoQueue.this.start) {
                    CircularFifoQueue.this.remove();
                    this.lastReturnedIndex = -1;
                } else {
                    int i10 = this.lastReturnedIndex + 1;
                    if (CircularFifoQueue.this.start >= this.lastReturnedIndex || i10 >= CircularFifoQueue.this.end) {
                        while (i10 != CircularFifoQueue.this.end) {
                            if (i10 >= CircularFifoQueue.this.maxElements) {
                                CircularFifoQueue.this.elements[i10 - 1] = CircularFifoQueue.this.elements[0];
                                i10 = 0;
                            } else {
                                CircularFifoQueue.this.elements[CircularFifoQueue.this.decrement(i10)] = CircularFifoQueue.this.elements[i10];
                                i10 = CircularFifoQueue.this.increment(i10);
                            }
                        }
                    } else {
                        System.arraycopy(CircularFifoQueue.this.elements, i10, CircularFifoQueue.this.elements, this.lastReturnedIndex, CircularFifoQueue.this.end - i10);
                    }
                    this.lastReturnedIndex = -1;
                    CircularFifoQueue circularFifoQueue = CircularFifoQueue.this;
                    int unused = circularFifoQueue.end = circularFifoQueue.decrement(circularFifoQueue.end);
                    CircularFifoQueue.this.elements[CircularFifoQueue.this.end] = null;
                    boolean unused2 = CircularFifoQueue.this.full = false;
                    this.index = CircularFifoQueue.this.decrement(this.index);
                }
            }
        };
    }

    public int maxSize() {
        return this.maxElements;
    }

    public boolean offer(E e10) {
        return add(e10);
    }

    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return this.elements[this.start];
    }

    public E poll() {
        if (isEmpty()) {
            return null;
        }
        return remove();
    }

    public E remove() {
        if (!isEmpty()) {
            E[] eArr = this.elements;
            int i = this.start;
            E e10 = eArr[i];
            if (e10 != null) {
                int i10 = i + 1;
                this.start = i10;
                eArr[i] = null;
                if (i10 >= this.maxElements) {
                    this.start = 0;
                }
                this.full = false;
            }
            return e10;
        }
        throw new NoSuchElementException("queue is empty");
    }

    public int size() {
        int i = this.end;
        int i10 = this.start;
        if (i < i10) {
            return (this.maxElements - i10) + i;
        }
        if (i != i10) {
            return i - i10;
        }
        if (this.full) {
            return this.maxElements;
        }
        return 0;
    }
}
