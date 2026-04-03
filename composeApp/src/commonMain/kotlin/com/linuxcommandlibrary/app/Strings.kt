package com.linuxcommandlibrary.app

object Strings {
    enum class Language(val displayName: String, val code: String) {
        CHINESE("中文", "zh"),
        ENGLISH("English", "en")
    }
    
    var currentLanguage: Language = Language.CHINESE
        private set
    
    fun setLanguage(lang: Language) { currentLanguage = lang }
    
    val basics: String get() = if (currentLanguage == Language.CHINESE) "基础" else "Basics"
    val tips: String get() = if (currentLanguage == Language.CHINESE) "技巧" else "Tips"
    val commands: String get() = if (currentLanguage == Language.CHINESE) "命令" else "Commands"
    
    val appInfoDialog = AppInfoStrings
    val bookmarkFeedback = BookmarkFeedbackStrings
    val welcomeDialog = WelcomeDialogStrings
    val searchScreen = SearchScreenStrings
    
    object AppInfoStrings {
        val appName: String get() = if (currentLanguage == Language.CHINESE) "Linux命令库" else "Linux Command Library"
        val version: String get() = if (currentLanguage == Language.CHINESE) "版本 %s" else "Version %s"
        val rateApp: String get() = if (currentLanguage == Language.CHINESE) "评价应用" else "Rate the app"
        val github: String get() = "GitHub"
        val supportProject: String get() = if (currentLanguage == Language.CHINESE) "支持此项目" else "Support this project"
        val referralDescription: String get() = if (currentLanguage == Language.CHINESE) "通过使用这些优质产品的推荐链接来支持。" else "By using my referral links for these amazing products."
        val sponsorOnGithub: String get() = if (currentLanguage == Language.CHINESE) "在GitHub上赞助" else "Sponsor on GitHub"
        val acknowledgements: String get() = if (currentLanguage == Language.CHINESE) "鸣谢" else "Acknowledgements"
        val manPages: String get() = if (currentLanguage == Language.CHINESE) "手册页" else "Man pages"
        val manPagesLicense: String get() = if (currentLanguage == Language.CHINESE) "手册页的许可信息通常在手册详情页的Author、Copyright或Licence部分中说明。" else "Licence information about the man page is usually specified in the man detail page under the category Author, Copyright or Licence."
        val tldrPages: String get() = if (currentLanguage == Language.CHINESE) "TLDR页面" else "TLDR pages"
        val tldrLicense: String get() = if (currentLanguage == Language.CHINESE) "MIT License (MIT) Copyright (c) 2014 TLDR团队和贡献者" else "The MIT License (MIT) Copyright (c) 2014 the TLDR team and contributors"
        val icons8Thanks: String get() = if (currentLanguage == Language.CHINESE) "感谢 icons8.com 提供图标" else "Thanks to icons8.com for the icons"
    }
    
    object BookmarkFeedbackStrings {
        val bookmarked: String get() = if (currentLanguage == Language.CHINESE) "已收藏" else "Bookmarked"
    }
    
    object WelcomeDialogStrings {
        val title: String get() = if (currentLanguage == Language.CHINESE) "欢迎使用 Linux命令库" else "Welcome to Linux Command Library"
        val subtitle: String get() = if (currentLanguage == Language.CHINESE) "完全离线的Linux命令参考手册" else "Your offline Linux command reference"
        val agreementTitle: String get() = if (currentLanguage == Language.CHINESE) "使用协议" else "Usage Agreement"
        val agreementContent: String get() = if (currentLanguage == Language.CHINESE) """本应用仅提供中文翻译服务。

应用内的命令说明、技术文档等原始内容版权归其各自作者所有。我们对翻译的准确性负责，但不对原始命令文档的内容准确性做任何保证。

重要提示：
• 命令参数、操作步骤等请以原始英文文档为准
• 我们不对因使用本应用中的信息而造成的任何损失负责
• 如有疑问，请查阅原始英文文档或相关官方资料""" else """This application provides Chinese translation services only.

All original command descriptions, technical documentation, etc. are copyrighted by their respective authors. We are responsible for the accuracy of translations but make no guarantees about the accuracy of original command documentation.

Important Notice:
• Command parameters and operating procedures should be verified against the original English documentation
• We are not responsible for any losses caused by using information in this app
• For questions, please refer to the original English documentation or official resources"""
        val agreeAndContinue: String get() = if (currentLanguage == Language.CHINESE) "同意并继续" else "Agree and Continue"
        val selectLanguage: String get() = if (currentLanguage == Language.CHINESE) "选择语言" else "Select Language"
    }
    
    object SearchScreenStrings {
        val notFound: String get() = if (currentLanguage == Language.CHINESE) "未找到命令" else "404 command not found"
    }
}
