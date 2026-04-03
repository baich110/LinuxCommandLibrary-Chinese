package com.linuxcommandlibrary.app.platform

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import com.linuxcommandlibrary.app.Strings

expect val showRateAppButton: Boolean
expect val showAndroidTerminalTip: Boolean
expect val showFastScrollBar: Boolean
expect val backIcon: ImageVector
expect val shareButtonIcon: ImageVector

val shareButtonDescription: String
    @Composable
    get() = if (Strings.currentLanguage == Strings.Language.CHINESE) "分享" else "Share"

@Composable
expect fun rememberOpenAppAction(): (String) -> Unit
