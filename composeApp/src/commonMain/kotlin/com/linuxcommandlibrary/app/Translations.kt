package com.linuxcommandlibrary.app

object Translations {
    private val basicsTranslation: Map<String, String> = mapOf(
        "aitools" to "AI工具",
        "compressionarchiving" to "压缩与归档",
        "cryptocurrencies" to "加密货币",
        "emacstexteditor" to "Emacs文本编辑器",
        "filesfolders" to "文件与文件夹",
        "git" to "Git版本控制",
        "hackingtools" to "黑客工具",
        "input" to "输入设备",
        "json" to "JSON处理",
        "microtexteditor" to "Micro文本编辑器",
        "nanotexteditor" to "Nano文本编辑器",
        "network" to "网络",
        "oneliners" to "单行命令",
        "packagemanager" to "软件包管理器",
        "picotexteditor" to "Pico文本编辑器",
        "printing" to "打印",
        "regularexpressions" to "正则表达式",
        "searchfind" to "搜索与查找",
        "shellscripting" to "Shell脚本编程",
        "ssh" to "SSH远程连接",
        "systemcontrol" to "系统控制",
        "systeminformation" to "系统信息",
        "terminalgames" to "终端游戏",
        "textprocessing" to "文本处理",
        "tmux" to "Tmux终端复用器",
        "usersgroups" to "用户与用户组",
        "videoaudio" to "视频与音频",
        "vimtexteditor" to "VIM文本编辑器"
    )
    
    fun translateBasicsCategory(id: String): String? {
        return basicsTranslation[id]
    }
}
