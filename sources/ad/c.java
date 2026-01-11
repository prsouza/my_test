package ad;

import ae.c;
import ah.v;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.location.LocationManager;
import android.os.Build;
import android.os.CancellationSignal;
import android.view.View;
import androidx.lifecycle.y0;
import bd.i;
import c3.k;
import ce.c;
import com.github.mikephil.charting.BuildConfig;
import ge.g0;
import ge.g1;
import ge.j1;
import ge.t;
import ge.u;
import ge.z;
import ge.z0;
import h1.e0;
import h1.j;
import h1.j0;
import io.nodle.cash.R;
import io.nodle.sdk.NodleContext;
import io.sentry.protocol.SentryRuntime;
import j2.a;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.math.BigInteger;
import java.net.URI;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import ji.m;
import ji.n;
import l6.b1;
import l6.s;
import md.g;
import nd.m;
import nd.x;
import org.slf4j.Logger;
import org.slf4j.Marker;
import pd.d;
import pd.h;
import qc.a;
import qd.b;
import rc.c;
import x2.e;
import x2.f;
import xd.l;
import xd.p;
import xe.i;
import xe.q;
import yd.y;
import zc.o;
import zc.r;

public class c {
    public static final int[] A = {16843074, R.attr.tickMark, R.attr.tickMarkTint, R.attr.tickMarkTintMode};
    public static final int[] B = {16842804, 16843117, 16843118, 16843119, 16843120, 16843666, 16843667};
    public static final int[] C = {16842804, R.attr.autoSizeMaxTextSize, R.attr.autoSizeMinTextSize, R.attr.autoSizePresetSizes, R.attr.autoSizeStepGranularity, R.attr.autoSizeTextType, R.attr.drawableBottomCompat, R.attr.drawableEndCompat, R.attr.drawableLeftCompat, R.attr.drawableRightCompat, R.attr.drawableStartCompat, R.attr.drawableTint, R.attr.drawableTintMode, R.attr.drawableTopCompat, R.attr.emojiCompatEnabled, R.attr.firstBaselineToTopHeight, R.attr.fontFamily, R.attr.fontVariationSettings, R.attr.lastBaselineToBottomHeight, R.attr.lineHeight, R.attr.textAllCaps, R.attr.textLocale};
    public static final int[] D = {16842839, 16842926, R.attr.actionBarDivider, R.attr.actionBarItemBackground, R.attr.actionBarPopupTheme, R.attr.actionBarSize, R.attr.actionBarSplitStyle, R.attr.actionBarStyle, R.attr.actionBarTabBarStyle, R.attr.actionBarTabStyle, R.attr.actionBarTabTextStyle, R.attr.actionBarTheme, R.attr.actionBarWidgetTheme, R.attr.actionButtonStyle, R.attr.actionDropDownStyle, R.attr.actionMenuTextAppearance, R.attr.actionMenuTextColor, R.attr.actionModeBackground, R.attr.actionModeCloseButtonStyle, R.attr.actionModeCloseContentDescription, R.attr.actionModeCloseDrawable, R.attr.actionModeCopyDrawable, R.attr.actionModeCutDrawable, R.attr.actionModeFindDrawable, R.attr.actionModePasteDrawable, R.attr.actionModePopupWindowStyle, R.attr.actionModeSelectAllDrawable, R.attr.actionModeShareDrawable, R.attr.actionModeSplitBackground, R.attr.actionModeStyle, R.attr.actionModeTheme, R.attr.actionModeWebSearchDrawable, R.attr.actionOverflowButtonStyle, R.attr.actionOverflowMenuStyle, R.attr.activityChooserViewStyle, R.attr.alertDialogButtonGroupStyle, R.attr.alertDialogCenterButtons, R.attr.alertDialogStyle, R.attr.alertDialogTheme, R.attr.autoCompleteTextViewStyle, R.attr.borderlessButtonStyle, R.attr.buttonBarButtonStyle, R.attr.buttonBarNegativeButtonStyle, R.attr.buttonBarNeutralButtonStyle, R.attr.buttonBarPositiveButtonStyle, R.attr.buttonBarStyle, R.attr.buttonStyle, R.attr.buttonStyleSmall, R.attr.checkboxStyle, R.attr.checkedTextViewStyle, R.attr.colorAccent, R.attr.colorBackgroundFloating, R.attr.colorButtonNormal, R.attr.colorControlActivated, R.attr.colorControlHighlight, R.attr.colorControlNormal, R.attr.colorError, R.attr.colorPrimary, R.attr.colorPrimaryDark, R.attr.colorSwitchThumbNormal, R.attr.controlBackground, R.attr.dialogCornerRadius, R.attr.dialogPreferredPadding, R.attr.dialogTheme, R.attr.dividerHorizontal, R.attr.dividerVertical, R.attr.dropDownListViewStyle, R.attr.dropdownListPreferredItemHeight, R.attr.editTextBackground, R.attr.editTextColor, R.attr.editTextStyle, R.attr.homeAsUpIndicator, R.attr.imageButtonStyle, R.attr.listChoiceBackgroundIndicator, R.attr.listChoiceIndicatorMultipleAnimated, R.attr.listChoiceIndicatorSingleAnimated, R.attr.listDividerAlertDialog, R.attr.listMenuViewStyle, R.attr.listPopupWindowStyle, R.attr.listPreferredItemHeight, R.attr.listPreferredItemHeightLarge, R.attr.listPreferredItemHeightSmall, R.attr.listPreferredItemPaddingEnd, R.attr.listPreferredItemPaddingLeft, R.attr.listPreferredItemPaddingRight, R.attr.listPreferredItemPaddingStart, R.attr.panelBackground, R.attr.panelMenuListTheme, R.attr.panelMenuListWidth, R.attr.popupMenuStyle, R.attr.popupWindowStyle, R.attr.radioButtonStyle, R.attr.ratingBarStyle, R.attr.ratingBarStyleIndicator, R.attr.ratingBarStyleSmall, R.attr.searchViewStyle, R.attr.seekBarStyle, R.attr.selectableItemBackground, R.attr.selectableItemBackgroundBorderless, R.attr.spinnerDropDownItemStyle, R.attr.spinnerStyle, R.attr.switchStyle, R.attr.textAppearanceLargePopupMenu, R.attr.textAppearanceListItem, R.attr.textAppearanceListItemSecondary, R.attr.textAppearanceListItemSmall, R.attr.textAppearancePopupMenuHeader, R.attr.textAppearanceSearchResultSubtitle, R.attr.textAppearanceSearchResultTitle, R.attr.textAppearanceSmallPopupMenu, R.attr.textColorAlertDialogListItem, R.attr.textColorSearchUrl, R.attr.toolbarNavigationButtonStyle, R.attr.toolbarStyle, R.attr.tooltipForegroundColor, R.attr.tooltipFrameBackground, R.attr.viewInflaterClass, R.attr.windowActionBar, R.attr.windowActionBarOverlay, R.attr.windowActionModeOverlay, R.attr.windowFixedHeightMajor, R.attr.windowFixedHeightMinor, R.attr.windowFixedWidthMajor, R.attr.windowFixedWidthMinor, R.attr.windowMinWidthMajor, R.attr.windowMinWidthMinor, R.attr.windowNoTitle};
    public static final int[] E = {R.attr.allowStacking};
    public static final int[] F = {16843016, R.attr.checkMarkCompat, R.attr.checkMarkTint, R.attr.checkMarkTintMode};
    public static final int[] G = {16843015, R.attr.buttonCompat, R.attr.buttonTint, R.attr.buttonTintMode};
    public static final int[] H = {16842927, 16842948, 16843046, 16843047, 16843048, R.attr.divider, R.attr.dividerPadding, R.attr.measureWithLargestChild, R.attr.showDividers};
    public static final int[] I = {16843436, 16843437};
    public static final int[] J = {16842766, 16842960, 16843156, 16843230, 16843231, 16843232};
    public static final int[] K = {16842754, 16842766, 16842960, 16843014, 16843156, 16843230, 16843231, 16843233, 16843234, 16843235, 16843236, 16843237, 16843375, R.attr.actionLayout, R.attr.actionProviderClass, R.attr.actionViewClass, R.attr.alphabeticModifiers, R.attr.contentDescription, R.attr.iconTint, R.attr.iconTintMode, R.attr.numericModifiers, R.attr.showAsAction, R.attr.tooltipText};
    public static final int[] L = {16842926, 16843052, 16843053, 16843054, 16843055, 16843056, 16843057, R.attr.preserveIconSpacing, R.attr.subMenuArrow};
    public static final int[] M = {16843126, 16843465, R.attr.overlapAnchor};
    public static final int[] N = {R.attr.paddingBottomNoButtons, R.attr.paddingTopNoTitle};
    public static final int[] O = {16842970, 16843039, 16843296, 16843364, R.attr.closeIcon, R.attr.commitIcon, R.attr.defaultQueryHint, R.attr.goIcon, R.attr.iconifiedByDefault, R.attr.layout, R.attr.queryBackground, R.attr.queryHint, R.attr.searchHintIcon, R.attr.searchIcon, R.attr.submitBackground, R.attr.suggestionRowLayout, R.attr.voiceIcon};
    public static final int[] P = {16842930, 16843126, 16843131, 16843362, R.attr.popupTheme};
    public static final int[] Q = {16843044, 16843045, 16843074, R.attr.showText, R.attr.splitTrack, R.attr.switchMinWidth, R.attr.switchPadding, R.attr.switchTextAppearance, R.attr.thumbTextPadding, R.attr.thumbTint, R.attr.thumbTintMode, R.attr.track, R.attr.trackTint, R.attr.trackTintMode};
    public static final int[] R = {16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, 16844165, R.attr.fontFamily, R.attr.fontVariationSettings, R.attr.textAllCaps, R.attr.textLocale};
    public static final int[] S = {16842927, 16843072, R.attr.buttonGravity, R.attr.collapseContentDescription, R.attr.collapseIcon, R.attr.contentInsetEnd, R.attr.contentInsetEndWithActions, R.attr.contentInsetLeft, R.attr.contentInsetRight, R.attr.contentInsetStart, R.attr.contentInsetStartWithNavigation, R.attr.logo, R.attr.logoDescription, R.attr.maxButtonHeight, R.attr.menu, R.attr.navigationContentDescription, R.attr.navigationIcon, R.attr.popupTheme, R.attr.subtitle, R.attr.subtitleTextAppearance, R.attr.subtitleTextColor, R.attr.title, R.attr.titleMargin, R.attr.titleMarginBottom, R.attr.titleMarginEnd, R.attr.titleMarginStart, R.attr.titleMarginTop, R.attr.titleMargins, R.attr.titleTextAppearance, R.attr.titleTextColor};
    public static final int[] T = {16842752, 16842970, R.attr.paddingEnd, R.attr.paddingStart, R.attr.theme};
    public static final int[] U = {16842964, R.attr.backgroundTint, R.attr.backgroundTintMode};
    public static final int[] V = {16842960, 16842994, 16842995};
    public static final k W = new k();
    public static final c X = new c();
    public static int Y;
    public static volatile f Z;

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f301a = {-1, -1, -1, -3};

    /* renamed from: a0  reason: collision with root package name */
    public static volatile e f302a0;

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f303b = {1, 0, 0, 4, -2, -1, 3, -4};
    public static final int[] b0 = {R.attr.lottie_autoPlay, R.attr.lottie_cacheComposition, R.attr.lottie_colorFilter, R.attr.lottie_enableMergePathsForKitKatAndAbove, R.attr.lottie_fallbackRes, R.attr.lottie_fileName, R.attr.lottie_imageAssetsFolder, R.attr.lottie_loop, R.attr.lottie_progress, R.attr.lottie_rawRes, R.attr.lottie_renderMode, R.attr.lottie_repeatCount, R.attr.lottie_repeatMode, R.attr.lottie_scale, R.attr.lottie_speed, R.attr.lottie_url};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f304c = {-1, -1, -1, -5, 1, 0, -4, 3};

    /* renamed from: c0  reason: collision with root package name */
    public static final c f305c0 = new c();

    /* renamed from: d  reason: collision with root package name */
    public static final long[] f306d = {2791191049453778211L, 2791191049453778402L, 6};

    /* renamed from: d0  reason: collision with root package name */
    public static final /* synthetic */ int f307d0 = 0;

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f308e = {16842754, 16842766, 16842960, 16843014, 16843156, 16843230, 16843231, 16843233, 16843234, 16843235, 16843236, 16843237, 16843375, R.attr.actionLayout, R.attr.actionProviderClass, R.attr.actionViewClass, R.attr.alphabeticModifiers, R.attr.contentDescription, R.attr.iconTint, R.attr.iconTintMode, R.attr.numericModifiers, R.attr.showAsAction, R.attr.tooltipText};

    /* renamed from: e0  reason: collision with root package name */
    public static final int[] f309e0 = {16842948, 16842960, 16842972, 16842996, 16842997, 16842999, 16843000, 16843001, 16843002, 16843039, 16843040, 16843071, 16843072, 16843551, 16843552, 16843553, 16843554, 16843555, 16843556, 16843557, 16843558, 16843559, 16843560, 16843701, 16843702, 16843770, 16843840, R.attr.animateCircleAngleTo, R.attr.animateRelativeTo, R.attr.barrierAllowsGoneWidgets, R.attr.barrierDirection, R.attr.barrierMargin, R.attr.chainUseRtl, R.attr.constraint_referenced_ids, R.attr.constraint_referenced_tags, R.attr.drawPath, R.attr.flow_firstHorizontalBias, R.attr.flow_firstHorizontalStyle, R.attr.flow_firstVerticalBias, R.attr.flow_firstVerticalStyle, R.attr.flow_horizontalAlign, R.attr.flow_horizontalBias, R.attr.flow_horizontalGap, R.attr.flow_horizontalStyle, R.attr.flow_lastHorizontalBias, R.attr.flow_lastHorizontalStyle, R.attr.flow_lastVerticalBias, R.attr.flow_lastVerticalStyle, R.attr.flow_maxElementsWrap, R.attr.flow_verticalAlign, R.attr.flow_verticalBias, R.attr.flow_verticalGap, R.attr.flow_verticalStyle, R.attr.flow_wrapMode, R.attr.guidelineUseRtl, R.attr.layout_constrainedHeight, R.attr.layout_constrainedWidth, R.attr.layout_constraintBaseline_creator, R.attr.layout_constraintBaseline_toBaselineOf, R.attr.layout_constraintBaseline_toBottomOf, R.attr.layout_constraintBaseline_toTopOf, R.attr.layout_constraintBottom_creator, R.attr.layout_constraintBottom_toBottomOf, R.attr.layout_constraintBottom_toTopOf, R.attr.layout_constraintCircle, R.attr.layout_constraintCircleAngle, R.attr.layout_constraintCircleRadius, R.attr.layout_constraintDimensionRatio, R.attr.layout_constraintEnd_toEndOf, R.attr.layout_constraintEnd_toStartOf, R.attr.layout_constraintGuide_begin, R.attr.layout_constraintGuide_end, R.attr.layout_constraintGuide_percent, R.attr.layout_constraintHeight, R.attr.layout_constraintHeight_default, R.attr.layout_constraintHeight_max, R.attr.layout_constraintHeight_min, R.attr.layout_constraintHeight_percent, R.attr.layout_constraintHorizontal_bias, R.attr.layout_constraintHorizontal_chainStyle, R.attr.layout_constraintHorizontal_weight, R.attr.layout_constraintLeft_creator, R.attr.layout_constraintLeft_toLeftOf, R.attr.layout_constraintLeft_toRightOf, R.attr.layout_constraintRight_creator, R.attr.layout_constraintRight_toLeftOf, R.attr.layout_constraintRight_toRightOf, R.attr.layout_constraintStart_toEndOf, R.attr.layout_constraintStart_toStartOf, R.attr.layout_constraintTag, R.attr.layout_constraintTop_creator, R.attr.layout_constraintTop_toBottomOf, R.attr.layout_constraintTop_toTopOf, R.attr.layout_constraintVertical_bias, R.attr.layout_constraintVertical_chainStyle, R.attr.layout_constraintVertical_weight, R.attr.layout_constraintWidth, R.attr.layout_constraintWidth_default, R.attr.layout_constraintWidth_max, R.attr.layout_constraintWidth_min, R.attr.layout_constraintWidth_percent, R.attr.layout_editor_absoluteX, R.attr.layout_editor_absoluteY, R.attr.layout_goneMarginBaseline, R.attr.layout_goneMarginBottom, R.attr.layout_goneMarginEnd, R.attr.layout_goneMarginLeft, R.attr.layout_goneMarginRight, R.attr.layout_goneMarginStart, R.attr.layout_goneMarginTop, R.attr.layout_marginBaseline, R.attr.layout_wrapBehaviorInParent, R.attr.motionProgress, R.attr.motionStagger, R.attr.pathMotionArc, R.attr.pivotAnchor, R.attr.polarRelativeTo, R.attr.quantizeMotionInterpolator, R.attr.quantizeMotionPhase, R.attr.quantizeMotionSteps, R.attr.transformPivotTarget, R.attr.transitionEasing, R.attr.transitionPathRotate, R.attr.visibilityMode};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f310f = {16843088};

    /* renamed from: f0  reason: collision with root package name */
    public static final int[] f311f0 = {16842948, 16842965, 16842966, 16842967, 16842968, 16842969, 16842972, 16842996, 16842997, 16842998, 16842999, 16843000, 16843001, 16843002, 16843039, 16843040, 16843071, 16843072, 16843699, 16843700, 16843701, 16843702, 16843840, 16844091, 16844092, R.attr.barrierAllowsGoneWidgets, R.attr.barrierDirection, R.attr.barrierMargin, R.attr.chainUseRtl, R.attr.circularflow_angles, R.attr.circularflow_defaultAngle, R.attr.circularflow_defaultRadius, R.attr.circularflow_radiusInDP, R.attr.circularflow_viewCenter, R.attr.constraintSet, R.attr.constraint_referenced_ids, R.attr.constraint_referenced_tags, R.attr.flow_firstHorizontalBias, R.attr.flow_firstHorizontalStyle, R.attr.flow_firstVerticalBias, R.attr.flow_firstVerticalStyle, R.attr.flow_horizontalAlign, R.attr.flow_horizontalBias, R.attr.flow_horizontalGap, R.attr.flow_horizontalStyle, R.attr.flow_lastHorizontalBias, R.attr.flow_lastHorizontalStyle, R.attr.flow_lastVerticalBias, R.attr.flow_lastVerticalStyle, R.attr.flow_maxElementsWrap, R.attr.flow_verticalAlign, R.attr.flow_verticalBias, R.attr.flow_verticalGap, R.attr.flow_verticalStyle, R.attr.flow_wrapMode, R.attr.guidelineUseRtl, R.attr.layoutDescription, R.attr.layout_constrainedHeight, R.attr.layout_constrainedWidth, R.attr.layout_constraintBaseline_creator, R.attr.layout_constraintBaseline_toBaselineOf, R.attr.layout_constraintBaseline_toBottomOf, R.attr.layout_constraintBaseline_toTopOf, R.attr.layout_constraintBottom_creator, R.attr.layout_constraintBottom_toBottomOf, R.attr.layout_constraintBottom_toTopOf, R.attr.layout_constraintCircle, R.attr.layout_constraintCircleAngle, R.attr.layout_constraintCircleRadius, R.attr.layout_constraintDimensionRatio, R.attr.layout_constraintEnd_toEndOf, R.attr.layout_constraintEnd_toStartOf, R.attr.layout_constraintGuide_begin, R.attr.layout_constraintGuide_end, R.attr.layout_constraintGuide_percent, R.attr.layout_constraintHeight, R.attr.layout_constraintHeight_default, R.attr.layout_constraintHeight_max, R.attr.layout_constraintHeight_min, R.attr.layout_constraintHeight_percent, R.attr.layout_constraintHorizontal_bias, R.attr.layout_constraintHorizontal_chainStyle, R.attr.layout_constraintHorizontal_weight, R.attr.layout_constraintLeft_creator, R.attr.layout_constraintLeft_toLeftOf, R.attr.layout_constraintLeft_toRightOf, R.attr.layout_constraintRight_creator, R.attr.layout_constraintRight_toLeftOf, R.attr.layout_constraintRight_toRightOf, R.attr.layout_constraintStart_toEndOf, R.attr.layout_constraintStart_toStartOf, R.attr.layout_constraintTag, R.attr.layout_constraintTop_creator, R.attr.layout_constraintTop_toBottomOf, R.attr.layout_constraintTop_toTopOf, R.attr.layout_constraintVertical_bias, R.attr.layout_constraintVertical_chainStyle, R.attr.layout_constraintVertical_weight, R.attr.layout_constraintWidth, R.attr.layout_constraintWidth_default, R.attr.layout_constraintWidth_max, R.attr.layout_constraintWidth_min, R.attr.layout_constraintWidth_percent, R.attr.layout_editor_absoluteX, R.attr.layout_editor_absoluteY, R.attr.layout_goneMarginBaseline, R.attr.layout_goneMarginBottom, R.attr.layout_goneMarginEnd, R.attr.layout_goneMarginLeft, R.attr.layout_goneMarginRight, R.attr.layout_goneMarginStart, R.attr.layout_goneMarginTop, R.attr.layout_marginBaseline, R.attr.layout_optimizationLevel, R.attr.layout_wrapBehaviorInParent};
    public static final int[] g = {16843044, 16843045, 16843087, 16843088};

    /* renamed from: g0  reason: collision with root package name */
    public static final int[] f312g0 = {16842948, 16842960, 16842972, 16842996, 16842997, 16842999, 16843000, 16843001, 16843002, 16843039, 16843040, 16843071, 16843072, 16843551, 16843552, 16843553, 16843554, 16843555, 16843556, 16843557, 16843558, 16843559, 16843560, 16843701, 16843702, 16843770, 16843840, R.attr.animateCircleAngleTo, R.attr.animateRelativeTo, R.attr.barrierAllowsGoneWidgets, R.attr.barrierDirection, R.attr.barrierMargin, R.attr.chainUseRtl, R.attr.constraint_referenced_ids, R.attr.drawPath, R.attr.flow_firstHorizontalBias, R.attr.flow_firstHorizontalStyle, R.attr.flow_firstVerticalBias, R.attr.flow_firstVerticalStyle, R.attr.flow_horizontalAlign, R.attr.flow_horizontalBias, R.attr.flow_horizontalGap, R.attr.flow_horizontalStyle, R.attr.flow_lastHorizontalBias, R.attr.flow_lastHorizontalStyle, R.attr.flow_lastVerticalBias, R.attr.flow_lastVerticalStyle, R.attr.flow_maxElementsWrap, R.attr.flow_verticalAlign, R.attr.flow_verticalBias, R.attr.flow_verticalGap, R.attr.flow_verticalStyle, R.attr.flow_wrapMode, R.attr.guidelineUseRtl, R.attr.layout_constrainedHeight, R.attr.layout_constrainedWidth, R.attr.layout_constraintBaseline_creator, R.attr.layout_constraintBottom_creator, R.attr.layout_constraintCircleAngle, R.attr.layout_constraintCircleRadius, R.attr.layout_constraintDimensionRatio, R.attr.layout_constraintGuide_begin, R.attr.layout_constraintGuide_end, R.attr.layout_constraintGuide_percent, R.attr.layout_constraintHeight, R.attr.layout_constraintHeight_default, R.attr.layout_constraintHeight_max, R.attr.layout_constraintHeight_min, R.attr.layout_constraintHeight_percent, R.attr.layout_constraintHorizontal_bias, R.attr.layout_constraintHorizontal_chainStyle, R.attr.layout_constraintHorizontal_weight, R.attr.layout_constraintLeft_creator, R.attr.layout_constraintRight_creator, R.attr.layout_constraintTag, R.attr.layout_constraintTop_creator, R.attr.layout_constraintVertical_bias, R.attr.layout_constraintVertical_chainStyle, R.attr.layout_constraintVertical_weight, R.attr.layout_constraintWidth, R.attr.layout_constraintWidth_default, R.attr.layout_constraintWidth_max, R.attr.layout_constraintWidth_min, R.attr.layout_constraintWidth_percent, R.attr.layout_editor_absoluteX, R.attr.layout_editor_absoluteY, R.attr.layout_goneMarginBaseline, R.attr.layout_goneMarginBottom, R.attr.layout_goneMarginEnd, R.attr.layout_goneMarginLeft, R.attr.layout_goneMarginRight, R.attr.layout_goneMarginStart, R.attr.layout_goneMarginTop, R.attr.layout_marginBaseline, R.attr.layout_wrapBehaviorInParent, R.attr.motionProgress, R.attr.motionStagger, R.attr.motionTarget, R.attr.pathMotionArc, R.attr.pivotAnchor, R.attr.polarRelativeTo, R.attr.quantizeMotionInterpolator, R.attr.quantizeMotionPhase, R.attr.quantizeMotionSteps, R.attr.transformPivotTarget, R.attr.transitionEasing, R.attr.transitionPathRotate, R.attr.visibilityMode};

    /* renamed from: h  reason: collision with root package name */
    public static final int[] f313h = {16843233, 16843473, R.attr.subtitle, R.attr.title};

    /* renamed from: h0  reason: collision with root package name */
    public static final int[] f314h0 = {16842948, 16842960, 16842972, 16842996, 16842997, 16842999, 16843000, 16843001, 16843002, 16843039, 16843040, 16843071, 16843072, 16843189, 16843190, 16843551, 16843552, 16843553, 16843554, 16843555, 16843556, 16843557, 16843558, 16843559, 16843560, 16843701, 16843702, 16843770, 16843840, R.attr.animateCircleAngleTo, R.attr.animateRelativeTo, R.attr.barrierAllowsGoneWidgets, R.attr.barrierDirection, R.attr.barrierMargin, R.attr.chainUseRtl, R.attr.constraintRotate, R.attr.constraint_referenced_ids, R.attr.constraint_referenced_tags, R.attr.deriveConstraintsFrom, R.attr.drawPath, R.attr.flow_firstHorizontalBias, R.attr.flow_firstHorizontalStyle, R.attr.flow_firstVerticalBias, R.attr.flow_firstVerticalStyle, R.attr.flow_horizontalAlign, R.attr.flow_horizontalBias, R.attr.flow_horizontalGap, R.attr.flow_horizontalStyle, R.attr.flow_lastHorizontalBias, R.attr.flow_lastHorizontalStyle, R.attr.flow_lastVerticalBias, R.attr.flow_lastVerticalStyle, R.attr.flow_maxElementsWrap, R.attr.flow_verticalAlign, R.attr.flow_verticalBias, R.attr.flow_verticalGap, R.attr.flow_verticalStyle, R.attr.flow_wrapMode, R.attr.guidelineUseRtl, R.attr.layout_constrainedHeight, R.attr.layout_constrainedWidth, R.attr.layout_constraintBaseline_creator, R.attr.layout_constraintBaseline_toBaselineOf, R.attr.layout_constraintBaseline_toBottomOf, R.attr.layout_constraintBaseline_toTopOf, R.attr.layout_constraintBottom_creator, R.attr.layout_constraintBottom_toBottomOf, R.attr.layout_constraintBottom_toTopOf, R.attr.layout_constraintCircle, R.attr.layout_constraintCircleAngle, R.attr.layout_constraintCircleRadius, R.attr.layout_constraintDimensionRatio, R.attr.layout_constraintEnd_toEndOf, R.attr.layout_constraintEnd_toStartOf, R.attr.layout_constraintGuide_begin, R.attr.layout_constraintGuide_end, R.attr.layout_constraintGuide_percent, R.attr.layout_constraintHeight_default, R.attr.layout_constraintHeight_max, R.attr.layout_constraintHeight_min, R.attr.layout_constraintHeight_percent, R.attr.layout_constraintHorizontal_bias, R.attr.layout_constraintHorizontal_chainStyle, R.attr.layout_constraintHorizontal_weight, R.attr.layout_constraintLeft_creator, R.attr.layout_constraintLeft_toLeftOf, R.attr.layout_constraintLeft_toRightOf, R.attr.layout_constraintRight_creator, R.attr.layout_constraintRight_toLeftOf, R.attr.layout_constraintRight_toRightOf, R.attr.layout_constraintStart_toEndOf, R.attr.layout_constraintStart_toStartOf, R.attr.layout_constraintTag, R.attr.layout_constraintTop_creator, R.attr.layout_constraintTop_toBottomOf, R.attr.layout_constraintTop_toTopOf, R.attr.layout_constraintVertical_bias, R.attr.layout_constraintVertical_chainStyle, R.attr.layout_constraintVertical_weight, R.attr.layout_constraintWidth_default, R.attr.layout_constraintWidth_max, R.attr.layout_constraintWidth_min, R.attr.layout_constraintWidth_percent, R.attr.layout_editor_absoluteX, R.attr.layout_editor_absoluteY, R.attr.layout_goneMarginBaseline, R.attr.layout_goneMarginBottom, R.attr.layout_goneMarginEnd, R.attr.layout_goneMarginLeft, R.attr.layout_goneMarginRight, R.attr.layout_goneMarginStart, R.attr.layout_goneMarginTop, R.attr.layout_marginBaseline, R.attr.layout_wrapBehaviorInParent, R.attr.motionProgress, R.attr.motionStagger, R.attr.pathMotionArc, R.attr.pivotAnchor, R.attr.polarRelativeTo, R.attr.quantizeMotionSteps, R.attr.transitionEasing, R.attr.transitionPathRotate};
    public static final int[] i = {16843379};

    /* renamed from: i0  reason: collision with root package name */
    public static final int[] f315i0 = {R.attr.attributeName, R.attr.customBoolean, R.attr.customColorDrawableValue, R.attr.customColorValue, R.attr.customDimension, R.attr.customFloatValue, R.attr.customIntegerValue, R.attr.customPixelDimension, R.attr.customReference, R.attr.customStringValue, R.attr.methodName};

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f316j = {16843247, 16843248, 16843249, R.attr.disableDependentsState, R.attr.summaryOff, R.attr.summaryOn};

    /* renamed from: j0  reason: collision with root package name */
    public static final int[] f317j0 = {16842948, 16842996, 16842997, 16842999, 16843000, 16843001, 16843002, 16843701, 16843702, R.attr.barrierAllowsGoneWidgets, R.attr.barrierDirection, R.attr.barrierMargin, R.attr.chainUseRtl, R.attr.constraint_referenced_ids, R.attr.constraint_referenced_tags, R.attr.guidelineUseRtl, R.attr.layout_constrainedHeight, R.attr.layout_constrainedWidth, R.attr.layout_constraintBaseline_creator, R.attr.layout_constraintBaseline_toBaselineOf, R.attr.layout_constraintBaseline_toBottomOf, R.attr.layout_constraintBaseline_toTopOf, R.attr.layout_constraintBottom_creator, R.attr.layout_constraintBottom_toBottomOf, R.attr.layout_constraintBottom_toTopOf, R.attr.layout_constraintCircle, R.attr.layout_constraintCircleAngle, R.attr.layout_constraintCircleRadius, R.attr.layout_constraintDimensionRatio, R.attr.layout_constraintEnd_toEndOf, R.attr.layout_constraintEnd_toStartOf, R.attr.layout_constraintGuide_begin, R.attr.layout_constraintGuide_end, R.attr.layout_constraintGuide_percent, R.attr.layout_constraintHeight, R.attr.layout_constraintHeight_default, R.attr.layout_constraintHeight_max, R.attr.layout_constraintHeight_min, R.attr.layout_constraintHeight_percent, R.attr.layout_constraintHorizontal_bias, R.attr.layout_constraintHorizontal_chainStyle, R.attr.layout_constraintHorizontal_weight, R.attr.layout_constraintLeft_creator, R.attr.layout_constraintLeft_toLeftOf, R.attr.layout_constraintLeft_toRightOf, R.attr.layout_constraintRight_creator, R.attr.layout_constraintRight_toLeftOf, R.attr.layout_constraintRight_toRightOf, R.attr.layout_constraintStart_toEndOf, R.attr.layout_constraintStart_toStartOf, R.attr.layout_constraintTop_creator, R.attr.layout_constraintTop_toBottomOf, R.attr.layout_constraintTop_toTopOf, R.attr.layout_constraintVertical_bias, R.attr.layout_constraintVertical_chainStyle, R.attr.layout_constraintVertical_weight, R.attr.layout_constraintWidth, R.attr.layout_constraintWidth_default, R.attr.layout_constraintWidth_max, R.attr.layout_constraintWidth_min, R.attr.layout_constraintWidth_percent, R.attr.layout_editor_absoluteX, R.attr.layout_editor_absoluteY, R.attr.layout_goneMarginBaseline, R.attr.layout_goneMarginBottom, R.attr.layout_goneMarginEnd, R.attr.layout_goneMarginLeft, R.attr.layout_goneMarginRight, R.attr.layout_goneMarginStart, R.attr.layout_goneMarginTop, R.attr.layout_marginBaseline, R.attr.layout_wrapBehaviorInParent, R.attr.maxHeight, R.attr.maxWidth, R.attr.minHeight, R.attr.minWidth};

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f318k = {16843250, 16843251, 16843252, 16843253, 16843254, 16843255, R.attr.dialogIcon, R.attr.dialogLayout, R.attr.dialogMessage, R.attr.dialogTitle, R.attr.negativeButtonText, R.attr.positiveButtonText};

    /* renamed from: k0  reason: collision with root package name */
    public static final int[] f319k0 = {R.attr.animateCircleAngleTo, R.attr.animateRelativeTo, R.attr.drawPath, R.attr.motionPathRotate, R.attr.motionStagger, R.attr.pathMotionArc, R.attr.quantizeMotionInterpolator, R.attr.quantizeMotionPhase, R.attr.quantizeMotionSteps, R.attr.transitionEasing};

    /* renamed from: l  reason: collision with root package name */
    public static final int[] f320l = {R.attr.useSimpleSummaryProvider};

    /* renamed from: l0  reason: collision with root package name */
    public static final int[] f321l0 = {R.attr.onHide, R.attr.onShow};

    /* renamed from: m  reason: collision with root package name */
    public static final int[] f322m = {16842930, 16843256, R.attr.entries, R.attr.entryValues, R.attr.useSimpleSummaryProvider};

    /* renamed from: m0  reason: collision with root package name */
    public static final int[] f323m0 = {16842972, 16843551, R.attr.layout_constraintTag, R.attr.motionProgress, R.attr.visibilityMode};

    /* renamed from: n  reason: collision with root package name */
    public static final int[] f324n = {16842930, 16843256, R.attr.entries, R.attr.entryValues};

    /* renamed from: n0  reason: collision with root package name */
    public static final int[] f325n0 = {16842960, R.attr.constraints};

    /* renamed from: o  reason: collision with root package name */
    public static final int[] f326o = {16842754, 16842765, 16842766, 16842994, 16843233, 16843238, 16843240, 16843241, 16843242, 16843243, 16843244, 16843245, 16843246, 16843491, 16844124, 16844129, R.attr.allowDividerAbove, R.attr.allowDividerBelow, R.attr.defaultValue, R.attr.dependency, R.attr.enableCopying, R.attr.enabled, R.attr.fragment, R.attr.icon, R.attr.iconSpaceReserved, R.attr.isPreferenceVisible, R.attr.key, R.attr.layout, R.attr.order, R.attr.persistent, R.attr.selectable, R.attr.shouldDisableView, R.attr.singleLineTitle, R.attr.summary, R.attr.title, R.attr.widgetLayout};

    /* renamed from: o0  reason: collision with root package name */
    public static final int[] f327o0 = {16843552, 16843553, 16843554, 16843555, 16843556, 16843557, 16843558, 16843559, 16843560, 16843770, 16843840, R.attr.transformPivotTarget};

    /* renamed from: p  reason: collision with root package name */
    public static final int[] f328p = {16843239, R.attr.initialExpandedChildrenCount, R.attr.orderingFromXml};

    /* renamed from: p0  reason: collision with root package name */
    public static final int[] f329p0 = {R.attr.constraints, R.attr.region_heightLessThan, R.attr.region_heightMoreThan, R.attr.region_widthLessThan, R.attr.region_widthMoreThan};

    /* renamed from: q  reason: collision with root package name */
    public static final int[] f330q = {16843039, 16843040, R.attr.maxHeight, R.attr.maxWidth};

    /* renamed from: q0  reason: collision with root package name */
    public static final int[] f331q0 = {R.attr.keylines, R.attr.statusBarBackground};

    /* renamed from: r  reason: collision with root package name */
    public static final int[] f332r = {16842994, 16843062, R.attr.adjustable, R.attr.min, R.attr.seekBarIncrement, R.attr.showSeekBarValue, R.attr.updatesContinuously};

    /* renamed from: r0  reason: collision with root package name */
    public static final int[] f333r0 = {16842931, R.attr.layout_anchor, R.attr.layout_anchorGravity, R.attr.layout_behavior, R.attr.layout_dodgeInsetEdges, R.attr.layout_insetEdge, R.attr.layout_keyline};

    /* renamed from: s  reason: collision with root package name */
    public static final int[] f334s = {16843247, 16843248, 16843249, 16843627, 16843628, R.attr.disableDependentsState, R.attr.summaryOff, R.attr.summaryOn, R.attr.switchTextOff, R.attr.switchTextOn};

    /* renamed from: t  reason: collision with root package name */
    public static final int[] f335t = {16843247, 16843248, 16843249, 16843627, 16843628, R.attr.disableDependentsState, R.attr.summaryOff, R.attr.summaryOn, R.attr.switchTextOff, R.attr.switchTextOn};

    /* renamed from: u  reason: collision with root package name */
    public static final int[] f336u = {R.attr.background, R.attr.backgroundSplit, R.attr.backgroundStacked, R.attr.contentInsetEnd, R.attr.contentInsetEndWithActions, R.attr.contentInsetLeft, R.attr.contentInsetRight, R.attr.contentInsetStart, R.attr.contentInsetStartWithNavigation, R.attr.customNavigationLayout, R.attr.displayOptions, R.attr.divider, R.attr.elevation, R.attr.height, R.attr.hideOnContentScroll, R.attr.homeAsUpIndicator, R.attr.homeLayout, R.attr.icon, R.attr.indeterminateProgressStyle, R.attr.itemPadding, R.attr.logo, R.attr.navigationMode, R.attr.popupTheme, R.attr.progressBarPadding, R.attr.progressBarStyle, R.attr.subtitle, R.attr.subtitleTextStyle, R.attr.title, R.attr.titleTextStyle};

    /* renamed from: v  reason: collision with root package name */
    public static final int[] f337v = {16842931};

    /* renamed from: w  reason: collision with root package name */
    public static final int[] f338w = {16843071};

    /* renamed from: x  reason: collision with root package name */
    public static final int[] f339x = {R.attr.background, R.attr.backgroundSplit, R.attr.closeItemLayout, R.attr.height, R.attr.subtitleTextStyle, R.attr.titleTextStyle};

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f340y = {16842994, R.attr.buttonIconDimen, R.attr.buttonPanelSideLayout, R.attr.listItemLayout, R.attr.listLayout, R.attr.multiChoiceItemLayout, R.attr.showTitle, R.attr.singleChoiceItemLayout};
    public static final int[] z = {16843033, R.attr.srcCompat, R.attr.tint, R.attr.tintMode};

    public static final int A(int i10, int i11, int i12) {
        if (i11 <= i12) {
            return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + '.');
    }

    public static final byte[] A0(a aVar, kc.a aVar2, Object obj) {
        e6.e.D(aVar, "$this$toByteArray");
        e6.e.D(aVar2, SentryRuntime.TYPE);
        try {
            return D0(new qc.c(aVar, aVar2, obj));
        } catch (Exception e10) {
            if (e10 instanceof sc.a) {
                throw e10;
            }
            throw new sc.a(e10);
        }
    }

    public static final d B(l lVar, d dVar) {
        e6.e.D(lVar, "<this>");
        e6.e.D(dVar, "completion");
        if (lVar instanceof rd.a) {
            return ((rd.a) lVar).create(dVar);
        }
        pd.f context = dVar.getContext();
        if (context == h.f9881a) {
            return new b(dVar, lVar);
        }
        return new qd.c(dVar, context, lVar);
    }

    public static final Object B0(Object obj, l lVar) {
        Throwable a10 = g.a(obj);
        if (a10 != null) {
            return new t(a10);
        }
        if (lVar != null) {
            return new u(obj, lVar);
        }
        return obj;
    }

    public static final d C(p pVar, Object obj, d dVar) {
        e6.e.D(pVar, "<this>");
        e6.e.D(dVar, "completion");
        if (pVar instanceof rd.a) {
            return ((rd.a) pVar).create(obj, dVar);
        }
        pd.f context = dVar.getContext();
        if (context == h.f9881a) {
            return new qd.d(dVar, pVar, obj);
        }
        return new qd.e(dVar, context, pVar, obj);
    }

    public static final ce.c C0(int i10, int i11) {
        if (i11 > Integer.MIN_VALUE) {
            return new ce.c(i10, i11 - 1);
        }
        c.a aVar = ce.c.f3437s;
        return ce.c.f3438t;
    }

    public static final ce.a D(int i10, int i11) {
        return new ce.a(i10, i11, -1);
    }

    public static final byte[] D0(l lVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        lVar.k(new ca.c(byteArrayOutputStream));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        e6.e.C(byteArray, "stream.toByteArray()");
        return byteArray;
    }

    public static void E() {
        int i10 = Y;
        if (i10 > 0) {
            Y = i10 - 1;
        }
    }

    public static int E0(byte[] bArr, int i10) {
        return ((bArr[i10 + 1] & 255) << 8) | (bArr[i10] & 255);
    }

    public static final void F(g1 g1Var) {
        if (!g1Var.a()) {
            throw g1Var.S();
        }
    }

    public static long F0(byte[] bArr, int i10) {
        return ((long) ((E0(bArr, i10 + 2) << 16) | E0(bArr, i10))) & 4294967295L;
    }

    public static final void G(pd.f fVar) {
        int i10 = g1.f5400e;
        g1 g1Var = (g1) fVar.get(g1.b.f5401a);
        if (g1Var != null) {
            F(g1Var);
        }
    }

    public static final Object H(e0 e0Var, CancellationSignal cancellationSignal, Callable callable, d dVar) {
        if (e0Var.n() && e0Var.j()) {
            return callable.call();
        }
        j0 j0Var = (j0) dVar.getContext().get(j0.f5737a);
        z d02 = a.b.d0(e0Var);
        ge.l lVar = new ge.l(Y(dVar), 1);
        lVar.u();
        lVar.i(new h1.k(cancellationSignal, ge.g.b(z0.f5476a, d02, new h1.l(callable, lVar, (d<? super h1.l>) null), 2)));
        Object t10 = lVar.t();
        qd.a aVar = qd.a.COROUTINE_SUSPENDED;
        return t10;
    }

    public static final Object I(e0 e0Var, Callable callable, d dVar) {
        if (e0Var.n() && e0Var.j()) {
            return callable.call();
        }
        j0 j0Var = (j0) dVar.getContext().get(j0.f5737a);
        return ge.g.d(a.b.e0(e0Var), new j(callable, (d<? super j>) null), dVar);
    }

    public static final Object J(a aVar, kc.a aVar2, String str) {
        try {
            return aVar.a(new ca.b(jc.b.r(str)), aVar2);
        } catch (Exception e10) {
            if (e10 instanceof sc.a) {
                throw e10;
            }
            throw new sc.a(e10);
        } catch (Exception e11) {
            if (e11 instanceof sc.a) {
                throw e11;
            }
            throw new sc.a(e11);
        }
    }

    public static final bb.e K(Context context) {
        e6.e.D(context, "cxt");
        int parseInt = Integer.parseInt(v.J(context, qa.e.SCAN_MODE));
        if (parseInt >= bb.e.values().length) {
            bb.e eVar = bb.e.ECO;
            r0(context, eVar);
            parseInt = eVar.ordinal();
        }
        return bb.e.values()[parseInt];
    }

    public static final Map L(Context context) {
        e6.e.D(context, "context");
        String string = context.getString(R.string.settingsAboutUs);
        String string2 = context.getString(R.string.settingsAboutUs);
        e6.e.C(string2, "context.getString(R.string.settingsAboutUs)");
        String string3 = context.getString(R.string.privacy);
        String string4 = context.getString(R.string.privacy);
        e6.e.C(string4, "context.getString(R.string.privacy)");
        String string5 = context.getString(R.string.settingsEULA);
        String string6 = context.getString(R.string.settingsEULA);
        e6.e.C(string6, "context.getString(R.string.settingsEULA)");
        String string7 = context.getString(R.string.settingsCommunity);
        String string8 = context.getString(R.string.settingsCommunity);
        e6.e.C(string8, "context.getString(R.string.settingsCommunity)");
        String string9 = context.getString(R.string.faq);
        String string10 = context.getString(R.string.faq);
        e6.e.C(string10, "context.getString(R.string.faq)");
        return x.u0(new md.f(string, new qa.a(string2, "https://nodle.com/about", (String) null)), new md.f(string3, new qa.a(string4, "https://nodle.com/privacy?publicKey=%s", (String) null)), new md.f(string5, new qa.a(string6, "https://nodle.com/eula", (String) null)), new md.f(string7, new qa.a(string8, (String) null, context.getString(R.string.supportContent))), new md.f(string9, new qa.a(string10, "https://docs.nodle.com/docs/nodle-wallets/nodle-cash/faq", (String) null)));
    }

    public static String M(long j10) {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        e6.e.C(timeZone, "getTimeZone(\"UTC\")");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.getDefault());
        simpleDateFormat.setTimeZone(timeZone);
        String format = simpleDateFormat.format(new Date(j10));
        e6.e.C(format, "dateFormat.format(Date(timeStampMillis))");
        return format;
    }

    public static final Map N(List list) {
        int P2 = aa.b.P(nd.g.S0(list));
        if (P2 < 16) {
            P2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(P2);
        for (Object next : list) {
            linkedHashMap.put(((r) next).getName(), next);
        }
        return x.x0(linkedHashMap);
    }

    public static final boolean O(Context context) {
        String[] strArr;
        e6.e.D(context, "context");
        if (Build.VERSION.SDK_INT >= 31) {
            strArr = new String[]{"android.permission.BLUETOOTH", "android.permission.BLUETOOTH_ADMIN", "android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_CONNECT"};
        } else {
            strArr = new String[]{"android.permission.BLUETOOTH", "android.permission.BLUETOOTH_ADMIN"};
        }
        return ei.c.a(context, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final boolean P(Context context) {
        e6.e.D(context, "context");
        return ei.c.a(context, (String[]) Arrays.copyOf(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2));
    }

    public static final boolean Q(Context context) {
        e6.e.D(context, "cxt");
        return Z(context) && a0(context) && O(context) && P(context);
    }

    public static void R(long[] jArr, long[] jArr2) {
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        jArr2[0] = j10 & 1152921504606846975L;
        jArr2[1] = ((j10 >>> 60) ^ (j11 << 4)) & 1152921504606846975L;
        jArr2[2] = ((j11 >>> 56) ^ (j12 << 8)) & 1152921504606846975L;
        jArr2[3] = (j12 >>> 52) ^ (j13 << 12);
    }

    public static void S(long[] jArr, long[] jArr2, long[] jArr3) {
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = ((jArr[2] << 40) ^ (j11 >>> 24)) & 17592186044415L;
        long j13 = ((j11 << 20) ^ (j10 >>> 44)) & 17592186044415L;
        long j14 = j10 & 17592186044415L;
        long j15 = jArr2[0];
        long j16 = jArr2[1];
        long j17 = ((j16 >>> 24) ^ (jArr2[2] << 40)) & 17592186044415L;
        long j18 = ((j15 >>> 44) ^ (j16 << 20)) & 17592186044415L;
        long j19 = j15 & 17592186044415L;
        long[] jArr4 = new long[10];
        long[] jArr5 = jArr4;
        U(j14, j19, jArr5, 0);
        U(j12, j17, jArr5, 2);
        long j20 = (j14 ^ j13) ^ j12;
        long j21 = (j19 ^ j18) ^ j17;
        long[] jArr6 = jArr4;
        U(j20, j21, jArr6, 4);
        long j22 = (j13 << 1) ^ (j12 << 2);
        long j23 = (j18 << 1) ^ (j17 << 2);
        U(j14 ^ j22, j19 ^ j23, jArr6, 6);
        U(j20 ^ j22, j21 ^ j23, jArr6, 8);
        long j24 = jArr4[6] ^ jArr4[8];
        long j25 = jArr4[7] ^ jArr4[9];
        long j26 = (j24 << 1) ^ jArr4[6];
        long j27 = (j24 ^ (j25 << 1)) ^ jArr4[7];
        long j28 = jArr4[0];
        long j29 = (jArr4[1] ^ jArr4[0]) ^ jArr4[4];
        long j30 = jArr4[1] ^ jArr4[5];
        long j31 = ((j26 ^ j28) ^ (jArr4[2] << 4)) ^ (jArr4[2] << 1);
        long j32 = (((j29 ^ j27) ^ (jArr4[3] << 4)) ^ (jArr4[3] << 1)) ^ (j31 >>> 44);
        long j33 = (j30 ^ j25) ^ (j32 >>> 44);
        long j34 = j32 & 17592186044415L;
        long j35 = ((j31 & 17592186044415L) >>> 1) ^ ((j34 & 1) << 43);
        long j36 = j35 ^ (j35 << 1);
        long j37 = j36 ^ (j36 << 2);
        long j38 = j37 ^ (j37 << 4);
        long j39 = j38 ^ (j38 << 8);
        long j40 = j39 ^ (j39 << 16);
        long j41 = (j40 ^ (j40 << 32)) & 17592186044415L;
        long j42 = ((j34 >>> 1) ^ ((j33 & 1) << 43)) ^ (j41 >>> 43);
        long j43 = j42 ^ (j42 << 1);
        long j44 = j43 ^ (j43 << 2);
        long j45 = j44 ^ (j44 << 4);
        long j46 = j45 ^ (j45 << 8);
        long j47 = j46 ^ (j46 << 16);
        long j48 = (j47 ^ (j47 << 32)) & 17592186044415L;
        long j49 = (j48 >>> 43) ^ (j33 >>> 1);
        long j50 = j49 ^ (j49 << 1);
        long j51 = j50 ^ (j50 << 2);
        long j52 = j51 ^ (j51 << 4);
        long j53 = j52 ^ (j52 << 8);
        long j54 = j53 ^ (j53 << 16);
        long j55 = j54 ^ (j54 << 32);
        jArr3[0] = j28;
        jArr3[1] = (j29 ^ j41) ^ jArr4[2];
        jArr3[2] = ((j30 ^ j48) ^ j41) ^ jArr4[3];
        jArr3[3] = j48 ^ j55;
        jArr3[4] = jArr4[2] ^ j55;
        jArr3[5] = jArr4[3];
        long j56 = jArr3[0];
        long j57 = jArr3[1];
        long j58 = jArr3[2];
        long j59 = jArr3[3];
        long j60 = jArr3[4];
        long j61 = jArr3[5];
        jArr3[0] = j56 ^ (j57 << 44);
        jArr3[1] = (j57 >>> 20) ^ (j58 << 24);
        jArr3[2] = ((j58 >>> 40) ^ (j59 << 4)) ^ (j60 << 48);
        jArr3[3] = ((j59 >>> 60) ^ (j61 << 28)) ^ (j60 >>> 16);
        jArr3[4] = j61 >>> 36;
        jArr3[5] = 0;
    }

    public static void T(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        R(jArr, jArr4);
        R(jArr2, jArr5);
        long[] jArr6 = jArr3;
        V(jArr4[0], jArr5[0], jArr6, 0);
        V(jArr4[1], jArr5[1], jArr6, 1);
        V(jArr4[2], jArr5[2], jArr6, 2);
        V(jArr4[3], jArr5[3], jArr6, 3);
        int i10 = 5;
        while (i10 > 0) {
            int i11 = i10 - 1;
            jArr3[i10] = jArr3[i10] ^ jArr3[i11];
            i10 = i11;
        }
        V(jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
        V(jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 3);
        for (int i12 = 7; i12 > 1; i12--) {
            jArr3[i12] = jArr3[i12] ^ jArr3[i12 - 2];
        }
        long j10 = jArr4[0] ^ jArr4[2];
        long j11 = jArr4[1] ^ jArr4[3];
        long j12 = jArr5[0] ^ jArr5[2];
        long j13 = jArr5[1] ^ jArr5[3];
        V(j10 ^ j11, j12 ^ j13, jArr3, 3);
        long[] jArr7 = new long[3];
        V(j10, j12, jArr7, 0);
        V(j11, j13, jArr7, 1);
        long j14 = jArr7[0];
        long j15 = jArr7[1];
        long j16 = jArr7[2];
        jArr3[2] = jArr3[2] ^ j14;
        jArr3[3] = (j14 ^ j15) ^ jArr3[3];
        jArr3[4] = jArr3[4] ^ (j16 ^ j15);
        jArr3[5] = jArr3[5] ^ j16;
        long j17 = jArr3[0];
        long j18 = jArr3[1];
        long j19 = jArr3[2];
        long j20 = jArr3[3];
        long j21 = jArr3[4];
        long j22 = jArr3[5];
        long j23 = jArr3[6];
        long j24 = jArr3[7];
        jArr3[0] = j17 ^ (j18 << 60);
        jArr3[1] = (j18 >>> 4) ^ (j19 << 56);
        jArr3[2] = (j19 >>> 8) ^ (j20 << 52);
        jArr3[3] = (j20 >>> 12) ^ (j21 << 48);
        jArr3[4] = (j21 >>> 16) ^ (j22 << 44);
        jArr3[5] = (j22 >>> 20) ^ (j23 << 40);
        jArr3[6] = (j23 >>> 24) ^ (j24 << 36);
        jArr3[7] = j24 >>> 28;
    }

    public static void U(long j10, long j11, long[] jArr, int i10) {
        long j12 = j10;
        long[] jArr2 = new long[8];
        jArr2[1] = j11;
        jArr2[2] = jArr2[1] << 1;
        jArr2[3] = jArr2[2] ^ j11;
        jArr2[4] = jArr2[2] << 1;
        jArr2[5] = jArr2[4] ^ j11;
        jArr2[6] = jArr2[3] << 1;
        jArr2[7] = jArr2[6] ^ j11;
        int i11 = (int) j12;
        long j13 = (jArr2[(i11 >>> 6) & 7] << 6) ^ (jArr2[i11 & 7] ^ (jArr2[(i11 >>> 3) & 7] << 3));
        long j14 = 0;
        int i12 = 33;
        do {
            int i13 = (int) (j12 >>> i12);
            long j15 = ((jArr2[i13 & 7] ^ (jArr2[(i13 >>> 3) & 7] << 3)) ^ (jArr2[(i13 >>> 6) & 7] << 6)) ^ (jArr2[(i13 >>> 9) & 7] << 9);
            j13 ^= j15 << i12;
            j14 ^= j15 >>> (-i12);
            i12 -= 12;
        } while (i12 > 0);
        jArr[i10] = 17592186044415L & j13;
        jArr[i10 + 1] = (j13 >>> 44) ^ (j14 << 20);
    }

    public static void V(long j10, long j11, long[] jArr, int i10) {
        long j12 = j10;
        long[] jArr2 = new long[8];
        jArr2[1] = j11;
        jArr2[2] = jArr2[1] << 1;
        jArr2[3] = jArr2[2] ^ j11;
        jArr2[4] = jArr2[2] << 1;
        jArr2[5] = jArr2[4] ^ j11;
        jArr2[6] = jArr2[3] << 1;
        jArr2[7] = jArr2[6] ^ j11;
        int i11 = (int) j12;
        long j13 = (jArr2[(i11 >>> 3) & 7] << 3) ^ jArr2[i11 & 7];
        long j14 = 0;
        int i12 = 54;
        do {
            int i13 = (int) (j12 >>> i12);
            long j15 = jArr2[i13 & 7] ^ (jArr2[(i13 >>> 3) & 7] << 3);
            j13 ^= j15 << i12;
            j14 ^= j15 >>> (-i12);
            i12 -= 6;
        } while (i12 > 0);
        jArr[i10] = jArr[i10] ^ (1152921504606846975L & j13);
        int i14 = i10 + 1;
        jArr[i14] = ((((((j12 & 585610922974906400L) & ((j11 << 4) >> 63)) >>> 5) ^ j14) << 4) ^ (j13 >>> 60)) ^ jArr[i14];
    }

    public static void W(long[] jArr, long[] jArr2) {
        e6.e.L(jArr[0], jArr2, 0);
        e6.e.L(jArr[1], jArr2, 2);
        int i10 = ((int) jArr[2]) & 255;
        int i11 = (i10 | (i10 << 4)) & 3855;
        int i12 = (i11 | (i11 << 2)) & 13107;
        jArr2[4] = ((long) ((i12 | (i12 << 1)) & 21845)) & 4294967295L;
    }

    public static void X(long[] jArr, long[] jArr2) {
        e6.e.L(jArr[0], jArr2, 0);
        e6.e.L(jArr[1], jArr2, 2);
        e6.e.L(jArr[2], jArr2, 4);
        e6.e.L(jArr[3], jArr2, 6);
    }

    public static final d Y(d dVar) {
        d<Object> intercepted;
        e6.e.D(dVar, "<this>");
        rd.c cVar = dVar instanceof rd.c ? (rd.c) dVar : null;
        return (cVar == null || (intercepted = cVar.intercepted()) == null) ? dVar : intercepted;
    }

    public static final boolean Z(Context context) {
        e6.e.D(context, "cxt");
        Object systemService = context.getSystemService("bluetooth");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.bluetooth.BluetoothManager");
        return ((BluetoothManager) systemService).getAdapter().isEnabled();
    }

    public static void a(int i10, byte[] bArr, int i11) {
        int i12 = i11 + 1;
        bArr[i11] = (byte) i10;
        int i13 = i12 + 1;
        bArr[i12] = (byte) (i10 >>> 8);
        bArr[i13] = (byte) (i10 >>> 16);
        bArr[i13 + 1] = (byte) (i10 >>> 24);
    }

    public static final boolean a0(Context context) {
        e6.e.D(context, "context");
        Object systemService = context.getSystemService("location");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        List<String> providers = ((LocationManager) systemService).getProviders(true);
        e6.e.C(providers, "context.getSystemService…nager).getProviders(true)");
        if (providers.contains("gps") || providers.contains("network")) {
            return true;
        }
        return false;
    }

    public static ge.r b() {
        return new j1((g1) null);
    }

    public static void b0(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[8];
        android.support.v4.media.b.l1(iArr, iArr2, iArr4);
        k0(iArr4, iArr3);
    }

    public static int c(byte[] bArr, int i10) {
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        byte b10 = (bArr[i10] & 255) | ((bArr[i11] & 255) << 8);
        return ((bArr[i12 + 1] & 255) << 24) | b10 | ((bArr[i12] & 255) << 16);
    }

    public static void c0(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[6];
        S(jArr, jArr2, jArr4);
        l0(jArr4, jArr3);
    }

    public static final long d(yi.a aVar, wi.d dVar) {
        b.c cVar;
        e6.e.D(aVar, "<this>");
        b.j r10 = aVar.b().r(dVar.f12715a);
        if (r10 != null) {
            if (r10.f2793s == 4) {
                cVar = (b.c) r10.f2794t;
            } else {
                cVar = b.c.f2760u;
            }
            if (cVar != null) {
                return cVar.f2762s;
            }
        }
        return 0;
    }

    public static void d0(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        T(jArr, jArr2, jArr4);
        m0(jArr4, jArr3);
    }

    public static final String e(NodleContext nodleContext) {
        e6.e.D(nodleContext, "<this>");
        return (String) ((a9.c) nodleContext.getSdkConfig()).a("nodle.authority", "nodle.io");
    }

    public static void e0(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[6];
        S(jArr, jArr2, jArr4);
        r(jArr3, jArr4, jArr3);
    }

    public static final String f(String str) {
        e6.e.D(str, "<this>");
        return fe.k.b1(fe.k.b1(str, ",", "_"), ":", Marker.ANY_MARKER);
    }

    public static void f0(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        T(jArr, jArr2, jArr4);
        s(jArr3, jArr4, jArr3);
    }

    public static final String g(yi.a aVar) {
        if (aVar.f13672e.size() <= 0) {
            return BuildConfig.FLAVOR;
        }
        Long peek = aVar.f13672e.peek();
        e6.e.C(peek, "stack.peek()");
        return j2.a.b(peek.longValue());
    }

    public static void g0(int[] iArr, int[] iArr2) {
        if (android.support.v4.media.b.W0(iArr)) {
            iArr2[0] = 0;
            iArr2[1] = 0;
            iArr2[2] = 0;
            iArr2[3] = 0;
            return;
        }
        android.support.v4.media.b.T1(f301a, iArr, iArr2);
    }

    public static final qg.e h(xe.f fVar, Number number) {
        e6.e.D(fVar, "$this$getEd25519SignatureKey");
        e6.e.D(number, "targetBlock");
        List<xe.j> list = fVar.f13196b;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean z10 = true;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (((xe.j) next).f13208a != 40) {
                z10 = false;
            }
            if (z10) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(nd.g.S0(arrayList));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            xe.p pVar = ((xe.j) it2.next()).f13212e;
            Objects.requireNonNull(pVar, "null cannot be cast to non-null type io.nodle.dtn.bpv7.bpsec.AbstractSecurityBlockData");
            arrayList2.add((gf.a) pVar);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (m.V0(((gf.a) next2).f5478a, number)) {
                arrayList3.add(next2);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            Object next3 = it4.next();
            if (((gf.a) next3).f5479b == 1) {
                arrayList4.add(next3);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it5 = arrayList4.iterator();
        while (it5.hasNext()) {
            Object next4 = it5.next();
            if (ui.c.b(((gf.a) next4).f5480c, 0)) {
                arrayList5.add(next4);
            }
        }
        ArrayList arrayList6 = new ArrayList(nd.g.S0(arrayList5));
        Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            aa.b bVar = ((gf.a) it6.next()).f5482e;
            Objects.requireNonNull(bVar, "null cannot be cast to non-null type io.nodle.dtn.bpv7.bpsec.Ed25519SecurityParameter");
            arrayList6.add((gf.e) bVar);
        }
        ArrayList arrayList7 = new ArrayList(nd.g.S0(arrayList6));
        Iterator it7 = arrayList6.iterator();
        while (it7.hasNext()) {
            arrayList7.add(((gf.e) it7.next()).I);
        }
        return (qg.e) m.Y0(arrayList7);
    }

    public static void h0(AnimatorSet animatorSet, List list) {
        int size = list.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Animator animator = (Animator) list.get(i10);
            j10 = Math.max(j10, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 0});
        ofInt.setDuration(j10);
        list.add(0, ofInt);
        animatorSet.playTogether(list);
    }

    public static final xe.f i(oi.a aVar) {
        oi.a aVar2 = aVar;
        e6.e.D(aVar2, "core");
        m.a aVar3 = (m.a) ji.m.f7335v.c();
        String aSCIIString = aVar2.f9454e.g().toASCIIString();
        aVar3.k();
        ji.m mVar = (ji.m) aVar3.f14359b;
        Objects.requireNonNull(mVar);
        Objects.requireNonNull(aSCIIString);
        mVar.f7337s = aSCIIString;
        a.b bVar = (a.b) aVar2.f9453d.a().f3215a;
        Objects.requireNonNull(bVar, "null cannot be cast to non-null type org.bouncycastle.crypto.params.Ed25519PublicKeyParameters");
        byte[] encoded = ((qg.e) bVar).getEncoded();
        e6.e.C(encoded, "core.sdkId.getCurrentPublicKey().encoded");
        String a10 = ui.c.a(encoded);
        aVar3.k();
        ji.m mVar2 = (ji.m) aVar3.f14359b;
        Objects.requireNonNull(mVar2);
        mVar2.f7338t = a10;
        long currentTimeMillis = System.currentTimeMillis();
        aVar3.k();
        ((ji.m) aVar3.f14359b).f7339u = currentTimeMillis;
        byte[] e10 = ((ji.m) aVar3.i()).e();
        String e11 = e(aVar2.f9450a);
        e6.e.D(e11, "node");
        xe.f I2 = k.I(new q(0, 0, (i) null, new URI("dtn", e11, "/auth", (String) null, (String) null), aVar2.f9454e.g(), jc.b.h(), 0, 0, 60000, 1733));
        a.b.u(I2, aa.b.i(e10), true);
        a.b.u(I2, new xe.j(10, 0, 0, (i) null, new gi.b(1, 1), 14), true);
        j(I2, k.s(aVar2.f9453d.a()), System.currentTimeMillis(), a.b.o0(0, 1));
        return I2;
    }

    public static final int i0(ce.c cVar) {
        c.a aVar = ae.c.f342a;
        try {
            return v.b0(cVar);
        } catch (IllegalArgumentException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    public static xe.f j(xe.f fVar, qg.d dVar, long j10, List list) {
        xe.f fVar2 = fVar;
        long j11 = j10;
        URI h10 = jc.b.h();
        qg.e S0 = dVar.S0();
        e6.e.C(S0, "key.generatePublicKey()");
        gf.a aVar = new gf.a((List) null, 1, 1, h10, new gf.e(S0, j11), 33);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            pi.e eVar = new pi.e(dVar);
            DataOutputStream dataOutputStream = new DataOutputStream(eVar);
            if (intValue == 0) {
                b1.i(fVar2.f13195a, dataOutputStream);
            } else {
                xe.j v10 = a.b.v(fVar2, intValue);
                if (v10 != null) {
                    b1.h(v10, eVar);
                } else {
                    throw new NoSuchElementException(jc.b.c("bundle has no block number ", intValue));
                }
            }
            dataOutputStream.writeLong(j11);
            dataOutputStream.flush();
            aVar.f5478a.add(Integer.valueOf(intValue));
            aVar.f5483f.add(new gf.f(ui.c.a(eVar.f10070a.a())));
        }
        a.b.u(fVar2, new xe.j(40, 0, 0, (i) null, aVar, 14), true);
        return fVar2;
    }

    public static final Object j0(Object obj) {
        return obj instanceof t ? b1.k(((t) obj).f5447a) : obj;
    }

    /* JADX WARNING: type inference failed for: r7v8, types: [java.util.HashMap, java.util.Map<java.lang.Integer, java.lang.Long>] */
    public static final yi.a k(yi.a aVar, b.f fVar) {
        Logger logger = yi.b.f13676a;
        StringBuilder q10 = a.b.q("~> loading sx: ");
        byte[] e10 = fVar.e();
        a.C0121a aVar2 = a.C0121a.f7014b;
        q10.append(nd.f.M(e10, aVar2));
        logger.debug(q10.toString());
        b.k s10 = fVar.r().s();
        e6.e.C(s10, "sx.manifest.permissions");
        aVar.f13668a = s10;
        byte[] i10 = fVar.f2773s.i();
        ByteBuffer wrap = ByteBuffer.wrap(i10);
        e6.e.C(wrap, "bin");
        aVar.f13669b = b1.a(wrap);
        wrap.position((int) aVar.a().f3038a);
        aVar.f13670c = b1.b(wrap, aVar.a());
        ByteBuffer.wrap(aVar.f13674h).put(i10);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("~> ");
        e6.e.C(i10, "bytecode");
        sb2.append(nd.f.M(i10, aVar2));
        sb2.append(' ');
        logger.debug(sb2.toString());
        logger.debug("~> segment table: ");
        logger.debug("~> -------------- ");
        logger.debug("~> events: " + j2.a.b(aVar.a().f3038a));
        logger.debug("~> text:   " + j2.a.b(aVar.a().f3039b));
        logger.debug("~> data:   " + j2.a.b(aVar.a().f3040c));
        logger.debug("~> ram:    " + j2.a.b(aVar.a().f3041d));
        logger.debug("~> ");
        logger.debug("~> event table: ");
        logger.debug("~> -------------- ");
        ? r72 = aVar.f13670c;
        if (r72 != 0) {
            for (Map.Entry entry : r72.entrySet()) {
                Logger logger2 = yi.b.f13676a;
                StringBuilder q11 = a.b.q("~> events: code=");
                q11.append(j2.a.a((byte) ((Number) entry.getKey()).intValue()));
                q11.append(" addr=");
                q11.append(j2.a.b(((Number) entry.getValue()).longValue()));
                logger2.debug(q11.toString());
            }
            yi.b.f13676a.debug("~> ");
            return aVar;
        }
        e6.e.c0("functions");
        throw null;
    }

    public static void k0(int[] iArr, int[] iArr2) {
        int[] iArr3 = iArr2;
        long j10 = ((long) iArr[7]) & 4294967295L;
        long j11 = (((long) iArr[3]) & 4294967295L) + j10;
        long j12 = (((long) iArr[6]) & 4294967295L) + (j10 << 1);
        long j13 = (((long) iArr[2]) & 4294967295L) + j12;
        long j14 = (((long) iArr[5]) & 4294967295L) + (j12 << 1);
        long j15 = (((long) iArr[1]) & 4294967295L) + j14;
        long j16 = (((long) iArr[4]) & 4294967295L) + (j14 << 1);
        long j17 = (((long) iArr[0]) & 4294967295L) + j16;
        iArr3[0] = (int) j17;
        long j18 = j15 + (j17 >>> 32);
        iArr3[1] = (int) j18;
        long j19 = j13 + (j18 >>> 32);
        iArr3[2] = (int) j19;
        long j20 = j11 + (j16 << 1) + (j19 >>> 32);
        iArr3[3] = (int) j20;
        n0((int) (j20 >>> 32), iArr3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        if (r2.contains(r4) != true) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void l(yi.a r2, wi.d r3, java.lang.String r4) {
        /*
            java.lang.String r0 = "<this>"
            e6.e.D(r2, r0)
            b.k r2 = r2.b()
            int r3 = r3.f12715a
            b.j r2 = r2.r(r3)
            r3 = 1
            if (r2 != 0) goto L_0x0013
            goto L_0x002e
        L_0x0013:
            int r0 = r2.f2793s
            r1 = 4
            if (r0 != r1) goto L_0x001d
            java.lang.Object r2 = r2.f2794t
            b.c r2 = (b.c) r2
            goto L_0x001f
        L_0x001d:
            b.c r2 = b.c.f2760u
        L_0x001f:
            if (r2 != 0) goto L_0x0022
            goto L_0x002e
        L_0x0022:
            zb.t$c<java.lang.String> r2 = r2.f2763t
            if (r2 != 0) goto L_0x0027
            goto L_0x002e
        L_0x0027:
            boolean r2 = r2.contains(r4)
            if (r2 != r3) goto L_0x002e
            goto L_0x002f
        L_0x002e:
            r3 = 0
        L_0x002f:
            if (r3 == 0) goto L_0x0032
            return
        L_0x0032:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "HTTP: "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r3 = " is forbidden"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            wi.c r2 = y.c.n(r2)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ad.c.l(yi.a, wi.d, java.lang.String):void");
    }

    public static void l0(long[] jArr, long[] jArr2) {
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = jArr[4];
        long j15 = j13 ^ (j14 >>> 59);
        long j16 = j10 ^ ((j15 << 61) ^ (j15 << 63));
        long j17 = (j11 ^ ((j14 << 61) ^ (j14 << 63))) ^ ((((j15 >>> 3) ^ (j15 >>> 1)) ^ j15) ^ (j15 << 5));
        long j18 = (j12 ^ ((((j14 >>> 3) ^ (j14 >>> 1)) ^ j14) ^ (j14 << 5))) ^ (j15 >>> 59);
        long j19 = j18 >>> 3;
        jArr2[0] = (((j16 ^ j19) ^ (j19 << 2)) ^ (j19 << 3)) ^ (j19 << 8);
        jArr2[1] = (j19 >>> 56) ^ j17;
        jArr2[2] = 7 & j18;
    }

    public static void m(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void m0(long[] jArr, long[] jArr2) {
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = jArr[4];
        long j15 = jArr[5];
        long j16 = jArr[6];
        long j17 = jArr[7];
        long j18 = j16 ^ (j17 >>> 17);
        long j19 = (j15 ^ (j17 << 47)) ^ (j18 >>> 17);
        long j20 = ((j14 ^ (j17 >>> 47)) ^ (j18 << 47)) ^ (j19 >>> 17);
        long j21 = j10 ^ (j20 << 17);
        long j22 = (j11 ^ (j19 << 17)) ^ (j20 >>> 47);
        long j23 = (((j13 ^ (j17 << 17)) ^ (j18 >>> 47)) ^ (j19 << 47)) ^ (j20 >>> 17);
        long j24 = j23 >>> 47;
        jArr2[0] = j21 ^ j24;
        jArr2[1] = j22;
        long j25 = j24 << 30;
        jArr2[2] = j25 ^ (((j12 ^ (j18 << 17)) ^ (j19 >>> 47)) ^ (j20 << 47));
        jArr2[3] = 140737488355327L & j23;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0062 A[LOOP:0: B:1:0x000c->B:18:0x0062, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0061 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean n(xe.f r6, io.nodle.sdk.NodleContext r7) {
        /*
            java.lang.String r0 = "<this>"
            e6.e.D(r6, r0)
            java.lang.String r0 = "ctx"
            e6.e.D(r7, r0)
            r0 = 0
            r1 = r0
        L_0x000c:
            r2 = 2
            if (r1 >= r2) goto L_0x0065
            int r2 = r1 + 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x0064 }
            boolean r3 = v(r6, r3)     // Catch:{ Exception -> 0x0064 }
            if (r3 != 0) goto L_0x001c
            return r0
        L_0x001c:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x0064 }
            qg.e r1 = h(r6, r1)     // Catch:{ Exception -> 0x0064 }
            if (r1 != 0) goto L_0x0027
            goto L_0x002d
        L_0x0027:
            byte[] r1 = r1.getEncoded()     // Catch:{ Exception -> 0x0064 }
            if (r1 != 0) goto L_0x002f
        L_0x002d:
            r1 = 0
            goto L_0x0033
        L_0x002f:
            java.lang.String r1 = bf.c.a(r1)     // Catch:{ Exception -> 0x0064 }
        L_0x0033:
            m2.a r3 = r7.getSdkConfig()     // Catch:{ Exception -> 0x0064 }
            java.lang.String r4 = "nodle.pub-key"
            java.lang.String r5 = "a2fe252365c4359dba8cc33f9f2ff40c5d51ff60ec12fad5a903fb36e07a2ff9"
            a9.c r3 = (a9.c) r3     // Catch:{ Exception -> 0x0064 }
            java.lang.Object r3 = r3.a(r4, r5)     // Catch:{ Exception -> 0x0064 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0064 }
            byte[] r3 = bf.c.b(r3)     // Catch:{ Exception -> 0x0064 }
            r4 = 32
            byte[] r5 = new byte[r4]     // Catch:{ Exception -> 0x0064 }
            java.lang.System.arraycopy(r3, r0, r5, r0, r4)     // Catch:{ Exception -> 0x0064 }
            byte[] r3 = xh.a.a(r5)     // Catch:{ Exception -> 0x0064 }
            java.lang.String r4 = "ctx.getNodlePubKey().hex…d25519PublicKey().encoded"
            e6.e.C(r3, r4)     // Catch:{ Exception -> 0x0064 }
            java.lang.String r3 = bf.c.a(r3)     // Catch:{ Exception -> 0x0064 }
            boolean r1 = e6.e.r(r1, r3)     // Catch:{ Exception -> 0x0064 }
            if (r1 != 0) goto L_0x0062
            return r0
        L_0x0062:
            r1 = r2
            goto L_0x000c
        L_0x0064:
            return r0
        L_0x0065:
            r6 = 1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ad.c.n(xe.f, io.nodle.sdk.NodleContext):boolean");
    }

    public static void n0(int i10, int[] iArr) {
        while (i10 != 0) {
            long j10 = ((long) i10) & 4294967295L;
            long j11 = (((long) iArr[0]) & 4294967295L) + j10;
            iArr[0] = (int) j11;
            long j12 = j11 >> 32;
            if (j12 != 0) {
                long j13 = j12 + (((long) iArr[1]) & 4294967295L);
                iArr[1] = (int) j13;
                long j14 = (j13 >> 32) + (((long) iArr[2]) & 4294967295L);
                iArr[2] = (int) j14;
                j12 = j14 >> 32;
            }
            long j15 = (4294967295L & ((long) iArr[3])) + (j10 << 1) + j12;
            iArr[3] = (int) j15;
            i10 = (int) (j15 >> 32);
        }
        if ((iArr[3] >>> 1) >= 2147483646 && android.support.v4.media.b.z0(iArr, f301a)) {
            t(iArr);
        }
    }

    public static final boolean o(xe.f fVar, xe.h hVar) {
        e6.e.D(fVar, "$this$isFlagSet");
        e6.e.D(hVar, "flag");
        return p(fVar.f13195a, hVar);
    }

    public static final oe.b o0(de.i iVar) {
        oe.b o02 = v.o0(ue.b.f11935a, iVar);
        if (o02 != null) {
            return v.c0(o02, ((y) iVar).b());
        }
        k.F0(g0.r(iVar));
        throw null;
    }

    public static final boolean p(q qVar, xe.h hVar) {
        e6.e.D(qVar, "$this$isFlagSet");
        e6.e.D(hVar, "flag");
        return ui.c.b(qVar.f13219b, hVar.f13203a);
    }

    public static void p0(View view, y0 y0Var) {
        view.setTag(R.id.view_tree_view_model_store_owner, y0Var);
    }

    public static void q(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L) + 0;
        iArr3[0] = (int) j10;
        long j11 = (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (j10 >>> 32);
        iArr3[1] = (int) j11;
        long j12 = (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (j11 >>> 32);
        iArr3[2] = (int) j12;
        long j13 = (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L) + (j12 >>> 32);
        iArr3[3] = (int) j13;
        if (((int) (j13 >>> 32)) != 0 || ((iArr3[3] >>> 1) >= 2147483646 && android.support.v4.media.b.z0(iArr3, f301a))) {
            t(iArr3);
        }
    }

    public static void q0(View view, androidx.savedstate.c cVar) {
        view.setTag(R.id.view_tree_saved_state_registry_owner, cVar);
    }

    public static void r(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr2[4] ^ jArr[4];
    }

    public static final void r0(Context context, bb.e eVar) {
        e6.e.D(context, "cxt");
        e6.e.D(eVar, "mode");
        v.f0(context, qa.e.SCAN_MODE, Integer.valueOf(eVar.ordinal()));
    }

    public static void s(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr2[7] ^ jArr[7];
    }

    public static void s0(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[8];
        android.support.v4.media.b.L1(iArr, iArr3);
        k0(iArr3, iArr2);
    }

    public static void t(int[] iArr) {
        long j10 = (((long) iArr[0]) & 4294967295L) + 1;
        iArr[0] = (int) j10;
        long j11 = j10 >> 32;
        if (j11 != 0) {
            long j12 = j11 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j12;
            long j13 = (j12 >> 32) + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j13;
            j11 = j13 >> 32;
        }
        iArr[3] = (int) ((4294967295L & ((long) iArr[3])) + 2 + j11);
    }

    public static void t0(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[5];
        W(jArr, jArr3);
        l0(jArr3, jArr2);
    }

    public static final xe.f u(oi.a aVar) {
        oi.a aVar2 = aVar;
        e6.e.D(aVar2, "core");
        n.a aVar3 = (n.a) n.f7340y.c();
        long currentTimeMillis = System.currentTimeMillis();
        aVar3.k();
        ((n) aVar3.f14359b).f7341s = currentTimeMillis;
        String str = aVar2.f9451b;
        aVar3.k();
        n nVar = (n) aVar3.f14359b;
        Objects.requireNonNull(nVar);
        Objects.requireNonNull(str);
        nVar.f7342t = str;
        String aSCIIString = aVar2.f9454e.g().toASCIIString();
        aVar3.k();
        n nVar2 = (n) aVar3.f14359b;
        Objects.requireNonNull(nVar2);
        Objects.requireNonNull(aSCIIString);
        nVar2.f7343u = aSCIIString;
        String b12 = nd.m.b1(aVar2.f9455f, ",", (CharSequence) null, (CharSequence) null, (l) null, 62);
        aVar3.k();
        n nVar3 = (n) aVar3.f14359b;
        Objects.requireNonNull(nVar3);
        nVar3.f7344v = b12;
        String gitSHA = aVar2.f9450a.getGitSHA();
        aVar3.k();
        n nVar4 = (n) aVar3.f14359b;
        Objects.requireNonNull(nVar4);
        Objects.requireNonNull(gitSHA);
        nVar4.f7345w = gitSHA;
        ze.c a10 = ((hf.f) aVar2.f9452c).d().a();
        ji.l a11 = a10 == null ? null : ((aj.f) a10).a();
        if (a11 == null) {
            a11 = aa.b.f();
        }
        aVar3.k();
        n nVar5 = (n) aVar3.f14359b;
        Objects.requireNonNull(nVar5);
        nVar5.f7346x = a11;
        byte[] e10 = ((n) aVar3.i()).e();
        String e11 = e(aVar2.f9450a);
        e6.e.D(e11, "node");
        xe.f I2 = k.I(new q(0, 0, (i) null, new URI("dtn", e11, "/status", (String) null, (String) null), aVar2.f9454e.g(), jc.b.h(), 0, 0, 60000, 1733));
        a.b.u(I2, aa.b.i(e10), true);
        a.b.u(I2, new xe.j(10, 0, 0, (i) null, new gi.b(1, 1), 14), true);
        j(I2, k.s(aVar2.f9453d.a()), System.currentTimeMillis(), a.b.o0(0, 1));
        return I2;
    }

    public static void u0(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[8];
        X(jArr, jArr3);
        m0(jArr3, jArr2);
    }

    public static final boolean v(xe.f fVar, Number number) {
        e6.e.D(fVar, "$this$isSignedWithEd25519");
        e6.e.D(number, "targetBlock");
        List<xe.j> list = fVar.f13196b;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean z10 = true;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (((xe.j) next).f13208a != 40) {
                z10 = false;
            }
            if (z10) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                xe.p pVar = ((xe.j) it2.next()).f13212e;
                Objects.requireNonNull(pVar, "null cannot be cast to non-null type io.nodle.dtn.bpv7.bpsec.AbstractSecurityBlockData");
                if (nd.m.V0(((gf.a) pVar).f5478a, number)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void v0(int[] iArr, int i10, int[] iArr2) {
        int[] iArr3 = new int[8];
        android.support.v4.media.b.L1(iArr, iArr3);
        while (true) {
            k0(iArr3, iArr2);
            i10--;
            if (i10 > 0) {
                android.support.v4.media.b.L1(iArr2, iArr3);
            } else {
                return;
            }
        }
    }

    public static final s w(zc.l lVar, oc.b bVar) {
        s sVar;
        s sVar2;
        String str;
        dd.a aVar;
        byte b10;
        String str2;
        ArrayList arrayList;
        s sVar3;
        h1.s sVar4;
        Iterator it;
        bd.g gVar;
        BigInteger bigInteger;
        Map map;
        Map map2;
        Map map3;
        Map map4;
        Map map5;
        String str3;
        dd.a aVar2;
        byte b11;
        ArrayList arrayList2;
        bd.i iVar;
        List list;
        s sVar5;
        String str4;
        dd.a aVar3;
        byte b12;
        BigInteger bigInteger2;
        ArrayList arrayList3;
        String str5;
        s sVar6;
        h1.s sVar7;
        Iterator it2;
        bd.g gVar2;
        Map map6;
        Map map7;
        dd.a aVar4;
        String str6;
        dd.a aVar5;
        byte b13;
        BigInteger bigInteger3;
        ArrayList arrayList4;
        i.b bVar2;
        i.a aVar6;
        zc.l lVar2 = lVar;
        oc.b bVar3 = bVar;
        String str7 = "property";
        String str8 = "BigInteger.valueOf(this.toLong())";
        if (lVar2.f14450a != 14) {
            dd.a<?> aVar7 = lVar2.f14451b;
            if (aVar7.f4448c instanceof zc.m) {
                zc.m mVar = zc.m.f14455t;
                Objects.requireNonNull(mVar);
                dd.c cVar = zc.m.f14454s;
                de.h[] hVarArr = zc.m.f14452b;
                dd.a aVar8 = (dd.a) aVar7.a(cVar.a(mVar, hVarArr[1]));
                zc.d dVar = zc.d.f14411t;
                Objects.requireNonNull(dVar);
                dd.c cVar2 = zc.d.f14409c;
                de.h[] hVarArr2 = zc.d.f14408b;
                s sVar8 = sVar5;
                BigInteger valueOf = BigInteger.valueOf((long) (((md.j) aVar8.a(cVar2.a(dVar, hVarArr2[0]))).f8550a & 255));
                e6.e.C(valueOf, str8);
                h1.s sVar9 = new h1.s(valueOf, (List) aVar8.a(zc.d.f14410s.a(dVar, hVarArr2[1])));
                char c10 = 0;
                List list2 = (List) aVar7.a(zc.m.f14453c.a(mVar, hVarArr[0]));
                ArrayList arrayList5 = new ArrayList(nd.g.S0(list2));
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    dd.a aVar9 = (dd.a) it3.next();
                    zc.j jVar = zc.j.f14443y;
                    Objects.requireNonNull(jVar);
                    dd.c cVar3 = zc.j.f14436c;
                    de.h[] hVarArr3 = zc.j.f14435b;
                    String str9 = (String) aVar9.a(cVar3.a(jVar, hVarArr3[c10]));
                    byte b14 = ((md.j) aVar9.a(zc.j.f14442x.a(jVar, hVarArr3[6]))).f8550a & 255;
                    BigInteger valueOf2 = BigInteger.valueOf((long) b14);
                    e6.e.C(valueOf2, str8);
                    a9.c cVar4 = zc.j.f14437s;
                    de.h hVar = hVarArr3[1];
                    Objects.requireNonNull(cVar4);
                    e6.e.D(hVar, str7);
                    dd.a aVar10 = (dd.a) aVar9.a((dd.b) cVar4.f176b);
                    if (aVar10 != null) {
                        zc.q qVar = zc.q.f14470t;
                        Objects.requireNonNull(qVar);
                        it2 = it3;
                        Iterable iterable = (Iterable) aVar10.a(zc.q.f14469s.a(qVar, zc.q.f14467b[1]));
                        ArrayList arrayList6 = new ArrayList(nd.g.S0(iterable));
                        Iterator it4 = iterable.iterator();
                        while (it4.hasNext()) {
                            dd.a aVar11 = (dd.a) it4.next();
                            Iterator it5 = it4;
                            ArrayList arrayList7 = arrayList6;
                            zc.n nVar = zc.n.f14462w;
                            Objects.requireNonNull(nVar);
                            h1.s sVar10 = sVar9;
                            dd.c cVar5 = zc.n.f14457c;
                            de.h[] hVarArr4 = zc.n.f14456b;
                            s sVar11 = sVar8;
                            String str10 = (String) aVar11.a(cVar5.a(nVar, hVarArr4[0]));
                            String str11 = str8;
                            o oVar = (o) aVar11.a(zc.n.f14458s.a(nVar, hVarArr4[1]));
                            Object a10 = aVar11.a(zc.n.f14459t.a(nVar, hVarArr4[2]));
                            if (a10 instanceof String) {
                                str6 = str7;
                                arrayList4 = arrayList5;
                                aVar5 = aVar9;
                                b13 = b14;
                                bigInteger3 = valueOf2;
                                aVar4 = aVar10;
                                bVar2 = new i.b(bVar3.a((String) a10));
                            } else if (a10 instanceof dd.a) {
                                dd.a aVar12 = (dd.a) a10;
                                S s10 = aVar12.f4448c;
                                arrayList4 = arrayList5;
                                zc.h hVar2 = zc.h.f14428u;
                                if (e6.e.r(s10, hVar2)) {
                                    Objects.requireNonNull(hVar2);
                                    dd.c cVar6 = zc.h.f14426s;
                                    de.h[] hVarArr5 = zc.h.f14424b;
                                    bigInteger3 = valueOf2;
                                    b13 = b14;
                                    aVar5 = aVar9;
                                    aVar6 = new i.a(a.b.n0(bVar3.a((String) aVar12.a(cVar6.a(hVar2, hVarArr5[1])))), a.b.n0(aVar12.a(zc.h.f14425c.a(hVar2, hVarArr5[0]))), bVar3.a((String) aVar12.a(zc.h.f14427t.a(hVar2, hVarArr5[2]))));
                                    str6 = str7;
                                    aVar4 = aVar10;
                                } else {
                                    aVar5 = aVar9;
                                    b13 = b14;
                                    bigInteger3 = valueOf2;
                                    zc.a aVar13 = zc.a.f14398w;
                                    if (e6.e.r(s10, aVar13)) {
                                        Objects.requireNonNull(aVar13);
                                        dd.c cVar7 = zc.a.f14394s;
                                        de.h[] hVarArr6 = zc.a.f14392b;
                                        str6 = str7;
                                        aVar4 = aVar10;
                                        aVar6 = new i.a(a.b.o0(bVar3.a((String) aVar12.a(cVar7.a(aVar13, hVarArr6[1]))), bVar3.a((String) aVar12.a(zc.a.f14395t.a(aVar13, hVarArr6[2])))), a.b.o0((zc.p) aVar12.a(zc.a.f14393c.a(aVar13, hVarArr6[0])), (zc.p) aVar12.a(zc.a.f14397v.a(aVar13, hVarArr6[4]))), bVar3.a((String) aVar12.a(zc.a.f14396u.a(aVar13, hVarArr6[3]))));
                                    } else {
                                        str6 = str7;
                                        aVar4 = aVar10;
                                        zc.k kVar = zc.k.f14448u;
                                        if (e6.e.r(s10, kVar)) {
                                            Objects.requireNonNull(kVar);
                                            Iterable<String> iterable2 = (Iterable) aVar12.a(zc.k.f14445c.a(kVar, zc.k.f14444b[0]));
                                            ArrayList arrayList8 = new ArrayList(nd.g.S0(iterable2));
                                            for (String a11 : iterable2) {
                                                arrayList8.add(bVar3.a(a11));
                                            }
                                            zc.k kVar2 = zc.k.f14448u;
                                            Objects.requireNonNull(kVar2);
                                            dd.c cVar8 = zc.k.f14446s;
                                            de.h[] hVarArr7 = zc.k.f14444b;
                                            bVar2 = new i.a(arrayList8, (List) aVar12.a(cVar8.a(kVar2, hVarArr7[1])), bVar3.a((String) aVar12.a(zc.k.f14447t.a(kVar2, hVarArr7[2]))));
                                        } else {
                                            throw new IllegalArgumentException(androidx.fragment.app.m.c("Cannot construct StorageEntryType from ", a10));
                                        }
                                    }
                                }
                                bVar2 = aVar6;
                            } else {
                                throw new IllegalArgumentException(androidx.fragment.app.m.c("Cannot construct StorageEntryType from ", a10));
                            }
                            zc.n nVar2 = zc.n.f14462w;
                            Objects.requireNonNull(nVar2);
                            dd.c cVar9 = zc.n.f14460u;
                            de.h[] hVarArr8 = zc.n.f14456b;
                            ArrayList arrayList9 = arrayList7;
                            arrayList9.add(new bd.h(str10, oVar, bVar2, (byte[]) aVar11.a(cVar9.a(nVar2, hVarArr8[3])), (List) aVar11.a(zc.n.f14461v.a(nVar2, hVarArr8[4])), str9));
                            zc.l lVar3 = lVar;
                            arrayList6 = arrayList9;
                            it4 = it5;
                            sVar9 = sVar10;
                            sVar8 = sVar11;
                            str8 = str11;
                            arrayList5 = arrayList4;
                            valueOf2 = bigInteger3;
                            b14 = b13;
                            aVar9 = aVar5;
                            str7 = str6;
                            aVar10 = aVar4;
                        }
                        str4 = str7;
                        arrayList3 = arrayList5;
                        aVar3 = aVar9;
                        str5 = str8;
                        b12 = b14;
                        sVar7 = sVar9;
                        bigInteger2 = valueOf2;
                        dd.a aVar14 = aVar10;
                        sVar6 = sVar8;
                        zc.q qVar2 = zc.q.f14470t;
                        Objects.requireNonNull(qVar2);
                        gVar2 = new bd.g((String) aVar10.a(zc.q.f14468c.a(qVar2, zc.q.f14467b[0])), N(arrayList6));
                    } else {
                        it2 = it3;
                        str4 = str7;
                        arrayList3 = arrayList5;
                        aVar3 = aVar9;
                        str5 = str8;
                        b12 = b14;
                        sVar7 = sVar9;
                        bigInteger2 = valueOf2;
                        sVar6 = sVar8;
                        gVar2 = null;
                    }
                    bd.g gVar3 = gVar2;
                    Objects.requireNonNull(zc.j.f14443y);
                    a9.c cVar10 = zc.j.f14438t;
                    de.h hVar3 = zc.j.f14435b[2];
                    Objects.requireNonNull(cVar10);
                    str7 = str4;
                    e6.e.D(hVar3, str7);
                    dd.a aVar15 = aVar3;
                    List list3 = (List) aVar15.a((dd.b) cVar10.f176b);
                    if (list3 != null) {
                        ArrayList arrayList10 = new ArrayList(nd.g.S0(list3));
                        Iterator it6 = list3.iterator();
                        int i10 = 0;
                        while (it6.hasNext()) {
                            Object next = it6.next();
                            int i11 = i10 + 1;
                            if (i10 >= 0) {
                                dd.a aVar16 = (dd.a) next;
                                zc.f fVar = zc.f.f14420u;
                                Objects.requireNonNull(fVar);
                                dd.c cVar11 = zc.f.f14417c;
                                de.h[] hVarArr9 = zc.f.f14416b;
                                String str12 = (String) aVar16.a(cVar11.a(fVar, hVarArr9[0]));
                                Iterable iterable3 = (Iterable) aVar16.a(zc.f.f14418s.a(fVar, hVarArr9[1]));
                                ArrayList arrayList11 = new ArrayList(nd.g.S0(iterable3));
                                for (Iterator it7 = iterable3.iterator(); it7.hasNext(); it7 = it7) {
                                    dd.a aVar17 = (dd.a) it7.next();
                                    zc.e eVar = zc.e.f14415t;
                                    Objects.requireNonNull(eVar);
                                    Iterator it8 = it6;
                                    dd.c cVar12 = zc.e.f14413c;
                                    de.h[] hVarArr10 = zc.e.f14412b;
                                    arrayList11.add(new bd.d((String) aVar17.a(cVar12.a(eVar, hVarArr10[0])), bVar3.a((String) aVar17.a(zc.e.f14414s.a(eVar, hVarArr10[1])))));
                                    it6 = it8;
                                    i11 = i11;
                                }
                                Iterator it9 = it6;
                                zc.f fVar2 = zc.f.f14420u;
                                Objects.requireNonNull(fVar2);
                                arrayList10.add(new bd.e(str12, arrayList11, (List) aVar16.a(zc.f.f14419t.a(fVar2, zc.f.f14416b[2])), new md.f(Integer.valueOf(b12), Integer.valueOf(i10))));
                                it6 = it9;
                                i10 = i11;
                            } else {
                                a.b.N0();
                                throw null;
                            }
                        }
                        map6 = N(arrayList10);
                    } else {
                        map6 = null;
                    }
                    Map map8 = map6;
                    Objects.requireNonNull(zc.j.f14443y);
                    a9.c cVar13 = zc.j.f14439u;
                    de.h hVar4 = zc.j.f14435b[3];
                    Objects.requireNonNull(cVar13);
                    e6.e.D(hVar4, str7);
                    List list4 = (List) aVar15.a((dd.b) cVar13.f176b);
                    if (list4 != null) {
                        ArrayList arrayList12 = new ArrayList(nd.g.S0(list4));
                        int i12 = 0;
                        for (Object next2 : list4) {
                            int i13 = i12 + 1;
                            if (i12 >= 0) {
                                dd.a aVar18 = (dd.a) next2;
                                zc.c cVar14 = zc.c.f14407u;
                                Objects.requireNonNull(cVar14);
                                dd.c cVar15 = zc.c.f14404c;
                                de.h[] hVarArr11 = zc.c.f14403b;
                                String str13 = (String) aVar18.a(cVar15.a(cVar14, hVarArr11[0]));
                                Iterable<String> iterable4 = (Iterable) aVar18.a(zc.c.f14405s.a(cVar14, hVarArr11[1]));
                                ArrayList arrayList13 = new ArrayList(nd.g.S0(iterable4));
                                for (String a12 : iterable4) {
                                    arrayList13.add(bVar3.a(a12));
                                }
                                zc.c cVar16 = zc.c.f14407u;
                                Objects.requireNonNull(cVar16);
                                arrayList12.add(new bd.c(str13, new md.f(Integer.valueOf(b12), Integer.valueOf(i12)), arrayList13, (List) aVar18.a(zc.c.f14406t.a(cVar16, zc.c.f14403b[2]))));
                                i12 = i13;
                            } else {
                                a.b.N0();
                                throw null;
                            }
                        }
                        map7 = N(arrayList12);
                    } else {
                        map7 = null;
                    }
                    Map map9 = map7;
                    zc.j jVar2 = zc.j.f14443y;
                    Objects.requireNonNull(jVar2);
                    List<dd.a> list5 = (List) aVar15.a(zc.j.f14440v.a(jVar2, zc.j.f14435b[4]));
                    ArrayList arrayList14 = new ArrayList(nd.g.S0(list5));
                    for (dd.a aVar19 : list5) {
                        zc.i iVar2 = zc.i.f14434v;
                        Objects.requireNonNull(iVar2);
                        dd.c cVar17 = zc.i.f14430c;
                        de.h[] hVarArr12 = zc.i.f14429b;
                        bVar3.a((String) aVar19.a(zc.i.f14431s.a(iVar2, hVarArr12[1])));
                        arrayList14.add(new bd.a((String) aVar19.a(cVar17.a(iVar2, hVarArr12[0])), (byte[]) aVar19.a(zc.i.f14432t.a(iVar2, hVarArr12[2])), (List) aVar19.a(zc.i.f14433u.a(iVar2, hVarArr12[3]))));
                    }
                    Map N2 = N(arrayList14);
                    zc.j jVar3 = zc.j.f14443y;
                    Objects.requireNonNull(jVar3);
                    List<dd.a> list6 = (List) aVar15.a(zc.j.f14441w.a(jVar3, zc.j.f14435b[5]));
                    ArrayList arrayList15 = new ArrayList(nd.g.S0(list6));
                    for (dd.a aVar20 : list6) {
                        zc.b bVar4 = zc.b.f14402t;
                        Objects.requireNonNull(bVar4);
                        dd.c cVar18 = zc.b.f14400c;
                        de.h[] hVarArr13 = zc.b.f14399b;
                        arrayList15.add(new bd.b((String) aVar20.a(cVar18.a(bVar4, hVarArr13[0])), (List) aVar20.a(zc.b.f14401s.a(bVar4, hVarArr13[1]))));
                    }
                    ArrayList arrayList16 = arrayList3;
                    arrayList16.add(new bd.f(str9, gVar3, map8, map9, N2, N(arrayList15), bigInteger2));
                    c10 = 0;
                    zc.l lVar4 = lVar;
                    arrayList5 = arrayList16;
                    it3 = it2;
                    sVar9 = sVar7;
                    sVar8 = sVar6;
                    str8 = str5;
                }
                Map N3 = N(arrayList5);
                BigInteger valueOf3 = BigInteger.valueOf((long) lVar.f14450a);
                e6.e.C(valueOf3, str8);
                sVar2 = new s(valueOf3, N3, sVar9);
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            String str14 = str8;
            dd.a<?> aVar21 = lVar2.f14451b;
            if (aVar21.f4448c instanceof cd.k) {
                cd.k kVar3 = cd.k.f3382u;
                Objects.requireNonNull(kVar3);
                dd.a aVar22 = (dd.a) aVar21.a(cd.k.f3381t.a(kVar3, cd.k.f3378b[2]));
                cd.a aVar23 = cd.a.f3336t;
                Objects.requireNonNull(aVar23);
                dd.c cVar19 = cd.a.f3334c;
                de.h[] hVarArr14 = cd.a.f3333b;
                BigInteger valueOf4 = BigInteger.valueOf((long) (((md.j) aVar22.a(cVar19.a(aVar23, hVarArr14[1]))).f8550a & 255));
                e6.e.C(valueOf4, str14);
                Iterable<dd.a> iterable5 = (Iterable) aVar22.a(cd.a.f3335s.a(aVar23, hVarArr14[2]));
                ArrayList arrayList17 = new ArrayList(nd.g.S0(iterable5));
                for (dd.a a13 : iterable5) {
                    cd.l lVar5 = cd.l.f3385s;
                    Objects.requireNonNull(lVar5);
                    arrayList17.add((String) a13.a(cd.l.f3384c.a(lVar5, cd.l.f3383b[0])));
                }
                h1.s sVar12 = new h1.s(valueOf4, (List) arrayList17);
                cd.k kVar4 = cd.k.f3382u;
                Objects.requireNonNull(kVar4);
                List list7 = (List) aVar21.a(cd.k.f3380s.a(kVar4, cd.k.f3378b[1]));
                ArrayList arrayList18 = new ArrayList(nd.g.S0(list7));
                Iterator it10 = list7.iterator();
                while (it10.hasNext()) {
                    dd.a aVar24 = (dd.a) it10.next();
                    cd.h hVar5 = cd.h.f3368y;
                    Objects.requireNonNull(hVar5);
                    dd.c cVar20 = cd.h.f3361c;
                    de.h[] hVarArr15 = cd.h.f3360b;
                    String str15 = (String) aVar24.a(cVar20.a(hVar5, hVarArr15[0]));
                    byte b15 = ((md.j) aVar24.a(cd.h.f3367x.a(hVar5, hVarArr15[6]))).f8550a & 255;
                    BigInteger valueOf5 = BigInteger.valueOf((long) b15);
                    e6.e.C(valueOf5, str14);
                    a9.c cVar21 = cd.h.f3362s;
                    de.h hVar6 = hVarArr15[1];
                    Objects.requireNonNull(cVar21);
                    e6.e.D(hVar6, str7);
                    dd.a aVar25 = (dd.a) aVar24.a((dd.b) cVar21.f176b);
                    if (aVar25 != null) {
                        cd.n nVar3 = cd.n.f3396t;
                        Objects.requireNonNull(nVar3);
                        it = it10;
                        Iterable iterable6 = (Iterable) aVar25.a(cd.n.f3395s.a(nVar3, cd.n.f3393b[1]));
                        ArrayList arrayList19 = new ArrayList(nd.g.S0(iterable6));
                        Iterator it11 = iterable6.iterator();
                        while (it11.hasNext()) {
                            dd.a aVar26 = (dd.a) it11.next();
                            Iterator it12 = it11;
                            ArrayList arrayList20 = arrayList19;
                            cd.m mVar2 = cd.m.f3392w;
                            Objects.requireNonNull(mVar2);
                            BigInteger bigInteger4 = valueOf5;
                            dd.c cVar22 = cd.m.f3387c;
                            de.h[] hVarArr16 = cd.m.f3386b;
                            h1.s sVar13 = sVar12;
                            String str16 = (String) aVar26.a(cVar22.a(mVar2, hVarArr16[0]));
                            s sVar14 = sVar;
                            o oVar2 = (o) aVar26.a(cd.m.f3388s.a(mVar2, hVarArr16[1]));
                            e6.e eVar2 = e6.e.f4643a;
                            String str17 = str14;
                            Object a14 = aVar26.a(cd.m.f3389t.a(mVar2, hVarArr16[2]));
                            if (a14 instanceof BigInteger) {
                                str3 = str7;
                                iVar = new i.b(bVar3.a(a14.toString()));
                                arrayList2 = arrayList18;
                                aVar2 = aVar24;
                                b11 = b15;
                            } else if (a14 instanceof dd.a) {
                                dd.a aVar27 = (dd.a) a14;
                                if (aVar27.f4448c instanceof cd.c) {
                                    cd.c cVar23 = cd.c.f3344u;
                                    Objects.requireNonNull(cVar23);
                                    arrayList2 = arrayList18;
                                    dd.c cVar24 = cd.c.f3341c;
                                    de.h[] hVarArr17 = cd.c.f3340b;
                                    b11 = b15;
                                    List list8 = (List) aVar27.a(cVar24.a(cVar23, hVarArr17[0]));
                                    aVar2 = aVar24;
                                    str3 = str7;
                                    String bigInteger5 = ((BigInteger) aVar27.a(cd.c.f3342s.a(cVar23, hVarArr17[1]))).toString();
                                    e6.e.C(bigInteger5, "enumValue[MapTypeV14.key].toString()");
                                    qc.a<?, ?> a15 = bVar3.a(bigInteger5);
                                    if (a15 != null) {
                                        if (list8.size() == 1) {
                                            list = a.b.n0(a15);
                                        } else if (a15 instanceof rc.h) {
                                            List<qc.d> list9 = ((rc.h) a15).f10666b;
                                            ArrayList arrayList21 = new ArrayList();
                                            for (qc.d dVar2 : list9) {
                                                qc.a<?, ?> aVar28 = dVar2.f10406b;
                                                if (aVar28 != null) {
                                                    arrayList21.add(aVar28);
                                                }
                                            }
                                            list = arrayList21;
                                        } else {
                                            eVar2.z(a14);
                                            throw null;
                                        }
                                        if (list.size() == list8.size()) {
                                            cd.c cVar25 = cd.c.f3344u;
                                            Objects.requireNonNull(cVar25);
                                            String bigInteger6 = ((BigInteger) aVar27.a(cd.c.f3343t.a(cVar25, cd.c.f3340b[2]))).toString();
                                            e6.e.C(bigInteger6, "enumValue[MapTypeV14.value].toString()");
                                            iVar = new i.a(list, list8, bVar3.a(bigInteger6));
                                        } else {
                                            throw new IllegalArgumentException(androidx.fragment.app.m.c("Cannot construct StorageEntryType from ", a14));
                                        }
                                    } else {
                                        eVar2.z(a14);
                                        throw null;
                                    }
                                } else {
                                    throw new IllegalArgumentException(androidx.fragment.app.m.c("Cannot construct StorageEntryType from ", a14));
                                }
                            } else {
                                eVar2.z(a14);
                                throw null;
                            }
                            cd.m mVar3 = cd.m.f3392w;
                            Objects.requireNonNull(mVar3);
                            dd.c cVar26 = cd.m.f3390u;
                            de.h[] hVarArr18 = cd.m.f3386b;
                            ArrayList arrayList22 = arrayList20;
                            arrayList22.add(new bd.h(str16, oVar2, iVar, (byte[]) aVar26.a(cVar26.a(mVar3, hVarArr18[3])), (List) aVar26.a(cd.m.f3391v.a(mVar3, hVarArr18[4])), str15));
                            zc.l lVar6 = lVar;
                            arrayList19 = arrayList22;
                            valueOf5 = bigInteger4;
                            it11 = it12;
                            sVar12 = sVar13;
                            sVar = sVar14;
                            arrayList18 = arrayList2;
                            str14 = str17;
                            b15 = b11;
                            aVar24 = aVar2;
                            str7 = str3;
                        }
                        str = str7;
                        str2 = str14;
                        sVar4 = sVar12;
                        sVar3 = sVar;
                        arrayList = arrayList18;
                        aVar = aVar24;
                        b10 = b15;
                        bigInteger = valueOf5;
                        map = null;
                        cd.n nVar4 = cd.n.f3396t;
                        Objects.requireNonNull(nVar4);
                        gVar = new bd.g((String) aVar25.a(cd.n.f3394c.a(nVar4, cd.n.f3393b[0])), N(arrayList19));
                    } else {
                        it = it10;
                        str = str7;
                        str2 = str14;
                        sVar4 = sVar12;
                        sVar3 = sVar;
                        arrayList = arrayList18;
                        aVar = aVar24;
                        b10 = b15;
                        bigInteger = valueOf5;
                        map = null;
                        gVar = null;
                    }
                    Objects.requireNonNull(cd.h.f3368y);
                    a9.c cVar27 = cd.h.f3363t;
                    de.h hVar7 = cd.h.f3360b[2];
                    Objects.requireNonNull(cVar27);
                    String str18 = str;
                    e6.e.D(hVar7, str18);
                    dd.a aVar29 = aVar;
                    dd.a aVar30 = (dd.a) aVar29.a((dd.b) cVar27.f176b);
                    if (aVar30 != null) {
                        cd.d dVar3 = cd.d.f3347s;
                        Objects.requireNonNull(dVar3);
                        String bigInteger7 = ((BigInteger) aVar30.a(cd.d.f3346c.a(dVar3, cd.d.f3345b[0]))).toString();
                        e6.e.C(bigInteger7, "callsRaw[PalletCallMetadataV14.type].toString()");
                        qc.a<?, ?> a16 = bVar3.a(bigInteger7);
                        if (!(a16 instanceof rc.c)) {
                            map2 = map;
                            map = nd.p.f8967a;
                        } else {
                            Map<Integer, c.a<qc.d>> map10 = ((rc.c) a16).f10659b;
                            ArrayList arrayList23 = new ArrayList(map10.size());
                            for (Map.Entry next3 : map10.entrySet()) {
                                int intValue = ((Number) next3.getKey()).intValue();
                                c.a aVar31 = (c.a) next3.getValue();
                                String str19 = aVar31.f10660a;
                                e6.e eVar3 = e6.e.f4643a;
                                qc.a<?, ?> aVar32 = ((qc.d) aVar31.f10661b).f10406b;
                                e6.e.B(aVar32);
                                arrayList23.add(new bd.e(str19, eVar3.M(aVar32, a.f299b), nd.o.f8966a, new md.f(Integer.valueOf(b10), Integer.valueOf(intValue))));
                                map = map;
                            }
                            map2 = map;
                            map = N(arrayList23);
                        }
                    } else {
                        map2 = map;
                    }
                    Objects.requireNonNull(cd.h.f3368y);
                    a9.c cVar28 = cd.h.f3364u;
                    de.h hVar8 = cd.h.f3360b[3];
                    Objects.requireNonNull(cVar28);
                    e6.e.D(hVar8, str18);
                    dd.a aVar33 = (dd.a) aVar29.a((dd.b) cVar28.f176b);
                    if (aVar33 != null) {
                        cd.g gVar4 = cd.g.f3359s;
                        Objects.requireNonNull(gVar4);
                        String bigInteger8 = ((BigInteger) aVar33.a(cd.g.f3358c.a(gVar4, cd.g.f3357b[0]))).toString();
                        e6.e.C(bigInteger8, "eventsRaw[PalletEventMetadataV14.type].toString()");
                        qc.a<?, ?> a17 = bVar3.a(bigInteger8);
                        if (!(a17 instanceof rc.c)) {
                            map5 = nd.p.f8967a;
                        } else {
                            Map<Integer, c.a<qc.d>> map11 = ((rc.c) a17).f10659b;
                            ArrayList arrayList24 = new ArrayList(map11.size());
                            for (Iterator<Map.Entry<Integer, c.a<qc.d>>> it13 = map11.entrySet().iterator(); it13.hasNext(); it13 = it13) {
                                Map.Entry next4 = it13.next();
                                int intValue2 = ((Number) next4.getKey()).intValue();
                                c.a aVar34 = (c.a) next4.getValue();
                                String str20 = aVar34.f10660a;
                                e6.e eVar4 = e6.e.f4643a;
                                qc.a<?, ?> aVar35 = ((qc.d) aVar34.f10661b).f10406b;
                                e6.e.B(aVar35);
                                arrayList24.add(new bd.c(str20, new md.f(Integer.valueOf(b10), Integer.valueOf(intValue2)), eVar4.M(aVar35, b.f300b), nd.o.f8966a));
                            }
                            map5 = N(arrayList24);
                        }
                        map3 = map5;
                    } else {
                        map3 = map2;
                    }
                    cd.h hVar9 = cd.h.f3368y;
                    Objects.requireNonNull(hVar9);
                    List list10 = (List) aVar29.a(cd.h.f3365v.a(hVar9, cd.h.f3360b[4]));
                    ArrayList arrayList25 = new ArrayList(nd.g.S0(list10));
                    for (Iterator it14 = list10.iterator(); it14.hasNext(); it14 = it14) {
                        dd.a aVar36 = (dd.a) it14.next();
                        cd.e eVar5 = cd.e.f3353v;
                        Objects.requireNonNull(eVar5);
                        dd.c cVar29 = cd.e.f3350s;
                        de.h[] hVarArr19 = cd.e.f3348b;
                        String bigInteger9 = ((BigInteger) aVar36.a(cVar29.a(eVar5, hVarArr19[1]))).toString();
                        e6.e.C(bigInteger9, "constantStruct[PalletCon…adataV14.type].toString()");
                        bVar3.a(bigInteger9);
                        arrayList25.add(new bd.a((String) aVar36.a(cd.e.f3349c.a(eVar5, hVarArr19[0])), (byte[]) aVar36.a(cd.e.f3351t.a(eVar5, hVarArr19[2])), (List) aVar36.a(cd.e.f3352u.a(eVar5, hVarArr19[3]))));
                    }
                    Map N4 = N(arrayList25);
                    Objects.requireNonNull(cd.h.f3368y);
                    a9.c cVar30 = cd.h.f3366w;
                    de.h hVar10 = cd.h.f3360b[5];
                    Objects.requireNonNull(cVar30);
                    e6.e.D(hVar10, str18);
                    dd.a aVar37 = (dd.a) aVar29.a((dd.b) cVar30.f176b);
                    if (aVar37 != null) {
                        cd.f fVar3 = cd.f.f3356s;
                        Objects.requireNonNull(fVar3);
                        String bigInteger10 = ((BigInteger) aVar37.a(cd.f.f3355c.a(fVar3, cd.f.f3354b[0]))).toString();
                        e6.e.C(bigInteger10, "errorsRaw[PalletErrorMetadataV14.type].toString()");
                        qc.a<?, ?> a18 = bVar3.a(bigInteger10);
                        if (!(a18 instanceof rc.c)) {
                            map4 = nd.p.f8967a;
                        } else {
                            Collection<c.a<qc.d>> values = ((rc.c) a18).f10659b.values();
                            ArrayList arrayList26 = new ArrayList(nd.g.S0(values));
                            for (c.a aVar38 : values) {
                                arrayList26.add(new bd.b(aVar38.f10660a, nd.o.f8966a));
                            }
                            map4 = N(arrayList26);
                        }
                    } else {
                        map4 = nd.p.f8967a;
                    }
                    Map map12 = map;
                    ArrayList arrayList27 = arrayList;
                    arrayList27.add(new bd.f(str15, gVar, map12, map3, N4, map4, bigInteger));
                    zc.l lVar7 = lVar;
                    arrayList18 = arrayList27;
                    str7 = str18;
                    it10 = it;
                    sVar12 = sVar4;
                    sVar = sVar3;
                    str14 = str2;
                }
                Map N5 = N(arrayList18);
                BigInteger valueOf6 = BigInteger.valueOf((long) lVar.f14450a);
                e6.e.C(valueOf6, str14);
                sVar2 = new s(valueOf6, N5, sVar12);
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
        return sVar2;
    }

    public static void w0(long[] jArr, int i10, long[] jArr2) {
        long[] jArr3 = new long[5];
        W(jArr, jArr3);
        while (true) {
            l0(jArr3, jArr2);
            i10--;
            if (i10 > 0) {
                W(jArr2, jArr3);
            } else {
                return;
            }
        }
    }

    public static final byte[] x(qc.a aVar, kc.a aVar2, Object obj) {
        e6.e.D(aVar, "$this$bytes");
        e6.e.D(aVar2, SentryRuntime.TYPE);
        try {
            return D0(new qc.b(aVar, aVar2, obj));
        } catch (Exception e10) {
            if (e10 instanceof sc.a) {
                throw e10;
            }
            throw new sc.a(e10);
        }
    }

    public static void x0(long[] jArr, int i10, long[] jArr2) {
        long[] jArr3 = new long[8];
        X(jArr, jArr3);
        while (true) {
            m0(jArr3, jArr2);
            i10--;
            if (i10 > 0) {
                X(jArr2, jArr3);
            } else {
                return;
            }
        }
    }

    public static final void y(pd.f fVar, CancellationException cancellationException) {
        int i10 = g1.f5400e;
        g1 g1Var = (g1) fVar.get(g1.b.f5401a);
        if (g1Var != null) {
            g1Var.c(cancellationException);
        }
    }

    public static final ce.a y0(ce.a aVar, int i10) {
        e6.e.D(aVar, "<this>");
        boolean z10 = i10 > 0;
        Integer valueOf = Integer.valueOf(i10);
        e6.e.D(valueOf, "step");
        if (z10) {
            int i11 = aVar.f3430a;
            int i12 = aVar.f3431b;
            if (aVar.f3432c <= 0) {
                i10 = -i10;
            }
            return new ce.a(i11, i12, i10);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
    }

    public static final void z(Closeable closeable, Throwable th2) {
        if (closeable == null) {
            return;
        }
        if (th2 == null) {
            closeable.close();
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th3) {
            a.b.D(th2, th3);
        }
    }

    public static void z0(int[] iArr, int[] iArr2, int[] iArr3) {
        if (android.support.v4.media.b.T1(iArr, iArr2, iArr3) != 0) {
            long j10 = (((long) iArr3[0]) & 4294967295L) - 1;
            iArr3[0] = (int) j10;
            long j11 = j10 >> 32;
            if (j11 != 0) {
                long j12 = j11 + (((long) iArr3[1]) & 4294967295L);
                iArr3[1] = (int) j12;
                long j13 = (j12 >> 32) + (((long) iArr3[2]) & 4294967295L);
                iArr3[2] = (int) j13;
                j11 = j13 >> 32;
            }
            iArr3[3] = (int) (((4294967295L & ((long) iArr3[3])) - 2) + j11);
        }
    }
}
