package com.houvven.twig.preset

import com.houvven.twig.preset.adapter.PresetAdapter


/**
 * value = name:code:country
 */
@Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")
enum class SimPreset(
    override val label: String,
    override val value: String
) : PresetAdapter {
    ChinaTelecom("中国电信", "中国电信:46003:CN"),
    ChinaUnicom("中国联通", "中国联通:46001:CN"),
    ChinaMobile("中国移动", "中国移动:46000:CN"),
    OneTwoFree("香港12Free", "12Free:46011:CN"),
    CTM("澳门CTM", "CTM:45502:CN"),
    CSL("香港CSL", "CSL:45412:CN"),
    HKT("香港HTK", "HKT:45407:CN"),
    ChunghwaTelecom("台湾中华电信", "中华电信:46697:CN"),
    FarEasTone("台湾遠傳", "遠傳:46692:CN"),
    TaiwanMobile("台湾台灣大哥大", "台灣大哥大:46601:CN"),
    TaiwanStar("台湾台灣之星", "台灣之星:46605:CN"),
    TStar("台湾亞太電信", "亞太電信:46602:CN"),
    Smartone("香港智能One", "智能One:45418:CN"),
    SingTel("新加坡星展", "星展:52501:CN"),
    KDDI("日本KDDI", "KDDI:44020:JP"),
    SoftBank("日本SoftBank", "SoftBank:44050:JP"),
    Verizon("美国Verizon", "Verizon:31000:US"),
    ATandT("美国AT&T", "AT&T:31000:US"),
    TMobile("美国T-Mobile", "T-Mobile:31000:US"),
    Sprint("美国Sprint", "Sprint:31000:US"),
    Vodafone("英国Vodafone", "Vodafone:23415:GB"),
    O2("英国O2", "O2:23415:GB"),
    EE("英国EE", "EE:23415:GB"),
    ThreeUK("英国ThreeUK", "ThreeUK:23415:GB"),
    VodafoneDE("德国Vodafone", "Vodafone:26201:DE"),
    TelekomDE("德国Telekom", "Telekom:26201:DE"),
    O2DE("德国O2", "O2:26201:DE"),
    TMobileDE("德国T-Mobile", "T-Mobile:26201:DE"),
    OrangeFR("法国Orange", "Orange:20801:FR"),
    SFRFR("法国SFR", "SFR:20801:FR"),
    BouyguesFR("法国Bouygues", "Bouygues:20801:FR"),
    TelekomFR("法国Telekom", "Telekom:20801:FR"),
    VodafoneIT("意大利Vodafone", "Vodafone:22201:IT"),
    TIMIT("意大利TIM", "TIM:22201:IT"),
    WindIT("意大利Wind", "Wind:22201:IT"),
    TelekomIT("意大利Telekom", "Telekom:22201:IT"),
    VodafoneES("西班牙Vodafone", "Vodafone:21401:ES"),
    OrangeES("西班牙Orange", "Orange:21401:ES"),
    TelekomES("西班牙Telekom", "Telekom:21401:ES"),
    VodafoneNL("荷兰Vodafone", "Vodafone:20404:NL"),
    KPNNL("荷兰KPN", "KPN:20404:NL"),
    TMobileNL("荷兰T-Mobile", "T-Mobile:20404:NL"),
    TelekomNL("荷兰Telekom", "Telekom:20404:NL"),
    VodafoneSE("瑞典Vodafone", "Vodafone:24001:SE"),
    TelekomSE("瑞典Telekom", "Telekom:24001:SE"),
    TelenorSE("瑞典Telenor", "Telenor:24001:SE"),
    ThreeSE("瑞典Three", "Three:24001:SE"),
    VodafoneDK("丹麦Vodafone", "Vodafone:23801:DK"),
    TDCDK("丹麦TDC", "TDC:23801:DK"),
    TelekomDK("丹麦Telekom", "Telekom:23801:DK"),
    TeliaDK("丹麦Telia", "Telia:23801:DK"),
    VodafoneFI("芬兰Vodafone", "Vodafone:24412:FI"),
    TelekomFI("芬兰Telekom", "Telekom:24412:FI"),
    ElisaFI("芬兰Elisa", "Elisa:24412:FI"),
    DNAFI("芬兰DNA", "DNA:24412:FI"),
    VodafoneNO("挪威Vodafone", "Vodafone:24201:NO"),
    TelenorNO("挪威Telenor", "Telenor:24201:NO"),
    TelekomNO("挪威Telekom", "Telekom:24201:NO"),
    NetComNO("挪威NetCom", "NetCom:24201:NO"),
    VodafoneBE("比利时Vodafone", "Vodafone:20610:BE"),
    ProximusBE("比利时Proximus", "Proximus:20610:BE"),
    OrangeBE("比利时Orange", "Orange:20610:BE"),
    TMobileBE("比利时T-Mobile", "T-Mobile:20610:BE"),
    TelekomBE("比利时Telekom", "Telekom:20610:BE"),
    VodafonePL("波兰Vodafone", "Vodafone:26002:PL"),
    TMobilePL("波兰T-Mobile", "T-Mobile:26002:PL"),
    OrangePL("波兰Orange", "Orange:26002:PL"),
    PlayPL("波兰Play", "Play:26002:PL"),
    TelekomPL("波兰Telekom", "Telekom:26002:PL"),
    VodafoneCZ("捷克Vodafone", "Vodafone:23001:CZ"),
    TelekomCZ("捷克Telekom", "Telekom:23001:CZ"),

    ;

}