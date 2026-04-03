package com.linuxcommandlibrary.shared.platform

object UserPreferences {
    private const val KEY_AGREEMENT_ACCEPTED = "agreement_accepted"
    private const val KEY_LANGUAGE_CODE = "language_code"
    private const val KEY_FIRST_LAUNCH = "first_launch"
    private var storage: PreferencesStorage? = null
    
    fun initialize(prefs: PreferencesStorage) { storage = prefs }
    private fun getStorage(): PreferencesStorage = storage ?: throw IllegalStateException("UserPreferences not initialized")
    
    var agreementAccepted: Boolean
        get() = getStorage().getBoolean(KEY_AGREEMENT_ACCEPTED, false)
        set(value) = getStorage().putBoolean(KEY_AGREEMENT_ACCEPTED, value)
    
    var languageCode: String
        get() = getStorage().getString(KEY_LANGUAGE_CODE, "zh")
        set(value) = getStorage().putString(KEY_LANGUAGE_CODE, value)
    
    var isFirstLaunch: Boolean
        get() = getStorage().getBoolean(KEY_FIRST_LAUNCH, true)
        set(value) = getStorage().putBoolean(KEY_FIRST_LAUNCH, value)
    
    val hasCompletedWelcomeFlow: Boolean
        get() = !isFirstLaunch || agreementAccepted
    
    fun completeWelcomeFlow() { isFirstLaunch = false; agreementAccepted = true }
}
