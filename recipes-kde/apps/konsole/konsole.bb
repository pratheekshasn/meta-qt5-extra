SUMMARY = "KDE's terminal emulator"
LICENSE = "GPL-2.0 & GFDL-1.2 & LGPL-2.0"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
    file://COPYING.DOC;md5=d8855fca80aa0b428deafa405d0ea17a \
    file://COPYING.LIB;md5=5f30f0716dfdd0d91eb439ebec522ec2 \
"

inherit kde-apps gettext

DEPENDS += " \
    kauth-native \
    kbookmarks \
    kcompletion \
    kconfig \
    kconfig-native \
    kconfigwidgets \
    kcoreaddons \
    kcoreaddons-native \
    kdoctools \
    kdoctools-native \
    kguiaddons \
    ki18n \
    kiconthemes \
    kinit \
    kio \
    knotifications \
    knotifyconfig \
    kparts \
    kpty \
    kservice \
    ktextwidgets \
    kwidgetsaddons \
    kwindowsystem \
    kxmlgui \
    sonnet-native \
    knewstuff \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/libx11", "", d)} \
"


PV = "${KDE_APP_VERSION}"
SRC_URI[sha256sum] = "21f57b47cc89de69cc4184ff9dfac0fd3ced0eac42771ae7a519225dd21300f1"

# do not move so-libs to -dev package
FILES_SOLIBSDEV = ""

FILES:${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/khotkeys \
    ${datadir}/knsrcfiles \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${libdir}/libkdeinit5_konsole.so \
"
