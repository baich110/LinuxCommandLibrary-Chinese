package com.linuxcommandlibrary.app

object Translations {
    // Basics分类翻译
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

    fun translateBasicsCategory(id: String): String? = basicsTranslation[id]

    // 小节标题翻译
    private val sectionTitleTranslations: Map<String, String> = mapOf(
        "TAGLINE" to "简介",
        "SYNOPSIS" to "概要",
        "DESCRIPTION" to "描述",
        "TLDR" to "简述",
        "EXAMPLES" to "示例",
        "OPTIONS" to "选项",
        "PARAMETERS" to "参数",
        "NOTES" to "备注",
        "AUTHOR" to "作者",
        "COPYRIGHT" to "版权",
        "LICENSE" to "许可证",
        "SEE ALSO" to "参见",
        "HISTORY" to "历史",
        "CAVEATS" to "注意事项",
        "RETURN VALUES" to "返回值",
        "ENVIRONMENT" to "环境变量",
        "FILES" to "相关文件",
        "BUGS" to "已知问题",
        "COMPATIBILITY" to "兼容性"
    )

    fun translateSectionTitle(title: String): String? = sectionTitleTranslations[title.uppercase()]

    // 命令名称翻译
    private val commandTranslations: Map<String, String> = mapOf(
        // 文件与目录
        "ls" to "ls (列出)", "cd" to "cd (切换)", "pwd" to "pwd (目录)", "mkdir" to "mkdir (目录)",
        "rmdir" to "rmdir (删除)", "rm" to "rm (删除)", "cp" to "cp (复制)", "mv" to "mv (移动)",
        "cat" to "cat (内容)", "less" to "less (分页)", "more" to "more (分页)", "head" to "head (开头)",
        "tail" to "tail (末尾)", "touch" to "touch (文件)", "file" to "file (类型)", "stat" to "stat (状态)",
        "ln" to "ln (链接)", "readlink" to "readlink (链接)", "realpath" to "realpath (路径)",
        "dirname" to "dirname (目录)", "basename" to "basename (文件)", "tree" to "tree (树形)",
        // 权限
        "chmod" to "chmod (权限)", "chown" to "chown (所有者)", "chgrp" to "chgrp (组)",
        "umask" to "umask (掩码)", "setfacl" to "setfacl (ACL)", "getfacl" to "getfacl (ACL)",
        // 压缩
        "tar" to "tar (归档)", "gzip" to "gzip (压缩)", "gunzip" to "gunzip (解压)",
        "bzip2" to "bzip2 (压缩)", "bunzip2" to "bunzip2 (解压)", "xz" to "xz (压缩)",
        "zip" to "zip (压缩)", "unzip" to "unzip (解压)", "rar" to "rar (压缩)",
        "unrar" to "unrar (解压)", "7z" to "7z (压缩)", "zcat" to "zcat (查看)",
        // 文本处理
        "grep" to "grep (搜索)", "egrep" to "egrep (搜索)", "fgrep" to "fgrep (搜索)",
        "sed" to "sed (编辑)", "awk" to "awk (处理)", "gawk" to "gawk (处理)",
        "cut" to "cut (剪切)", "paste" to "paste (合并)", "tr" to "tr (转换)",
        "sort" to "sort (排序)", "uniq" to "uniq (去重)", "wc" to "wc (统计)",
        "fmt" to "fmt (格式)", "fold" to "fold (折行)", "column" to "column (格式)",
        "nl" to "nl (编号)", "rev" to "rev (反转)", "tac" to "tac (反向)",
        "join" to "join (连接)", "comm" to "comm (比较)", "diff" to "diff (比较)",
        "patch" to "patch (补丁)",
        // 搜索
        "find" to "find (查找)", "locate" to "locate (查找)",
        "whereis" to "whereis (位置)", "which" to "which (路径)", "type" to "type (类型)",
        "whatis" to "whatis (说明)", "apropos" to "apropos (搜索)",
        // 磁盘
        "df" to "df (磁盘)", "du" to "du (大小)", "mount" to "mount (挂载)",
        "umount" to "umount (卸载)", "fdisk" to "fdisk (分区)", "parted" to "parted (分区)",
        "mkfs" to "mkfs (格式化)", "fsck" to "fsck (检查)", "blkid" to "blkid (设备)",
        "lsblk" to "lsblk (块设备)", "swapon" to "swapon (交换)", "swapoff" to "swapoff (交换)",
        "sync" to "sync (同步)",
        // 系统信息
        "uname" to "uname (系统)", "hostname" to "hostname (主机)", "hostnamectl" to "hostnamectl (主机)",
        "uptime" to "uptime (运行)", "dmesg" to "dmesg (内核)", "lsmod" to "lsmod (模块)",
        "modinfo" to "modinfo (模块)", "lspci" to "lspci (PCI)", "lsusb" to "lsusb (USB)",
        "lscpu" to "lscpu (CPU)", "free" to "free (内存)", "vmstat" to "vmstat (内存)",
        "iostat" to "iostat (IO)", "sar" to "sar (性能)",
        // 进程
        "ps" to "ps (进程)", "top" to "top (监控)", "htop" to "htop (监控)",
        "glances" to "glances (监控)", "pstree" to "pstree (树)", "pgrep" to "pgrep (搜索)",
        "pidof" to "pidof (ID)", "kill" to "kill (终止)", "killall" to "killall (终止)",
        "pkill" to "pkill (终止)", "nice" to "nice (优先级)", "renice" to "renice (优先级)",
        "nohup" to "nohup (后台)", "bg" to "bg (后台)", "fg" to "fg (前台)",
        "jobs" to "jobs (任务)", "screen" to "screen (终端)", "tmux" to "tmux (终端)",
        "wait" to "wait (等待)", "timeout" to "timeout (超时)",
        // 用户
        "useradd" to "useradd (用户)", "userdel" to "userdel (用户)", "usermod" to "usermod (用户)",
        "passwd" to "passwd (密码)", "groupadd" to "groupadd (组)", "groupdel" to "groupdel (组)",
        "groups" to "groups (组)", "id" to "id (ID)", "whoami" to "whoami (用户)",
        "logname" to "logname (名)", "who" to "who (用户)", "w" to "w (在线)",
        "last" to "last (记录)", "lastb" to "lastb (失败)", "users" to "users (列表)",
        "su" to "su (切换)", "sudo" to "sudo (提权)", "visudo" to "visudo (sudoers)",
        // 网络
        "ip" to "ip (网络)", "ifconfig" to "ifconfig (配置)", "ifstat" to "ifstat (统计)",
        "netstat" to "netstat (状态)", "ss" to "ss (套接字)", "ping" to "ping (测试)",
        "traceroute" to "traceroute (路由)", "tracepath" to "tracepath (路径)",
        "nslookup" to "nslookup (DNS)", "dig" to "dig (DNS)", "host" to "host (DNS)",
        "nmap" to "nmap (扫描)", "nc" to "nc (网络)", "ncat" to "ncat (网络)",
        "curl" to "curl (传输)", "wget" to "wget (下载)", "aria2c" to "aria2c (下载)",
        "ssh" to "ssh (远程)", "sshfs" to "sshfs (挂载)", "scp" to "scp (复制)",
        "sftp" to "sftp (FTP)", "rsync" to "rsync (同步)", "ftp" to "ftp (FTP)",
        "lftp" to "lftp (FTP)", "telnet" to "telnet (远程)", "route" to "route (路由)",
        "arp" to "arp (ARP)", "iptables" to "iptables (防火墙)", "nft" to "nft (防火墙)",
        "ufw" to "ufw (防火墙)", "firewall-cmd" to "firewall-cmd (防火墙)",
        "ethtool" to "ethtool (网卡)", "iwconfig" to "iwconfig (无线)", "iw" to "iw (无线)",
        // 系统控制
        "systemctl" to "systemctl (系统)", "systemd" to "systemd (系统)",
        "journalctl" to "journalctl (日志)", "systemd-analyze" to "systemd-analyze (分析)",
        "service" to "service (服务)", "shutdown" to "shutdown (关机)", "reboot" to "reboot (重启)",
        "halt" to "halt (关机)", "poweroff" to "poweroff (关机)",
        "init" to "init (运行级)", "runlevel" to "runlevel (级别)",
        // 包管理
        "apt" to "apt (包)", "apt-get" to "apt-get (包)", "aptitude" to "aptitude (包)",
        "dpkg" to "dpkg (包)", "yum" to "yum (包)", "dnf" to "dnf (包)",
        "rpm" to "rpm (包)", "pacman" to "pacman (包)", "snap" to "snap (包)",
        "flatpak" to "flatpak (包)", "brew" to "brew (包)",
        // Git
        "git" to "git (版本)", "git init" to "git init (初始化)", "git clone" to "git clone (克隆)",
        "git add" to "git add (添加)", "git commit" to "git commit (提交)", "git push" to "git push (推送)",
        "git pull" to "git pull (拉取)", "git fetch" to "git fetch (获取)", "git merge" to "git merge (合并)",
        "git branch" to "git branch (分支)", "git checkout" to "git checkout (切换)",
        "git status" to "git status (状态)", "git log" to "git log (日志)",
        "git diff" to "git diff (差异)", "git stash" to "git stash (暂存)",
        // 编译
        "gcc" to "gcc (编译)", "g++" to "g++ (编译)", "make" to "make (构建)",
        "cmake" to "cmake (构建)", "gdb" to "gdb (调试)", "valgrind" to "valgrind (内存)",
        // 开发
        "python" to "python", "python3" to "python3", "pip" to "pip (Python)",
        "java" to "java", "javac" to "javac (编译)", "mvn" to "mvn (Maven)",
        "gradle" to "gradle", "go" to "go", "cargo" to "cargo (Rust)",
        "npm" to "npm (Node)", "node" to "node (Node)", "yarn" to "yarn (包)",
        "docker" to "docker (容器)", "kubectl" to "kubectl (K8s)", "helm" to "helm (K8s)",
        // 编辑器
        "nano" to "nano (编辑)", "vim" to "vim (编辑)", "vi" to "vi (编辑)",
        "emacs" to "emacs (编辑)", "micro" to "micro (编辑)", "neovim" to "neovim (编辑)",
        // Shell
        "bash" to "bash (Shell)", "sh" to "sh (Shell)", "zsh" to "zsh (Shell)",
        "fish" to "fish (Shell)", "echo" to "echo (输出)", "printf" to "printf (输出)",
        "read" to "read (读取)", "export" to "export (导出)", "env" to "env (环境)",
        "source" to "source (加载)", "alias" to "alias (别名)", "history" to "history (历史)",
        // 杂项
        "date" to "date (日期)", "cal" to "cal (日历)", "ncal" to "ncal (日历)",
        "crontab" to "crontab (定时)", "at" to "at (定时)", "sleep" to "sleep (睡眠)",
        "watch" to "watch (监视)", "time" to "time (计时)",
        "md5sum" to "md5sum (校验)", "sha1sum" to "sha1sum (校验)", "sha256sum" to "sha256sum (校验)",
        "sha512sum" to "sha512sum (校验)",
        "dd" to "dd (转换)", "base64" to "base64 (编码)", "od" to "od (进制)",
        "hexdump" to "hexdump (十六)", "strings" to "strings (字符串)",
        "strace" to "strace (追踪)", "lsof" to "lsof (文件)", "fuser" to "fuser (进程)",
        "pmap" to "pmap (内存)", "ionice" to "ionice (IO)",
        "jq" to "jq (JSON)", "xargs" to "xargs (参数)",
        "man" to "man (手册)", "info" to "info (帮助)",
        "bc" to "bc (计算)",
        // VPN
        "openvpn" to "openvpn (VPN)", "wireguard" to "wireguard (VPN)",
        // 虚拟机
        "qemu" to "qemu (虚拟机)", "kvm" to "kvm (虚拟机)", "vagrant" to "vagrant (虚拟机)",
        // 其他
        "yes" to "yes (重复)", "true" to "true (真)", "false" to "false (假)",
        "test" to "test (测试)", "seq" to "seq (序列)", "shuf" to "shuf (随机)",
        "shred" to "shred (粉碎)", "ddrescue" to "ddrescue (恢复)"
    )

    fun translateCommandName(name: String): String? = commandTranslations[name]
}
