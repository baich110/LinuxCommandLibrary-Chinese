package com.linuxcommandlibrary.chinese

import android.app.Application
import com.linuxcommandlibrary.app.Strings
import com.linuxcommandlibrary.app.di.commonModule
import com.linuxcommandlibrary.app.di.platformModule
import com.linuxcommandlibrary.shared.platform.PreferencesStorage
import com.linuxcommandlibrary.shared.platform.UserPreferences
import org.koin.android.ext.android.inject
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin

class LinuxApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@LinuxApplication)
            modules(commonModule, platformModule())
        }
        val prefs: PreferencesStorage by inject()
        UserPreferences.initialize(prefs)
        val lang = when (UserPreferences.languageCode) {
            "en" -> Strings.Language.ENGLISH
            else -> Strings.Language.CHINESE
        }
        Strings.setLanguage(lang)
    }
}
