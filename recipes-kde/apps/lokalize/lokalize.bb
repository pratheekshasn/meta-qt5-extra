SUMMARY = "Computer-aided translation"
LICENSE = "GPLv2 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=7108e5acd7ce861dee282297d7c2f38c \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-apps gtk-icon-cache mime-xdg

DEPENDS += "\
    qtscript \
    hunspell \
	\
    kauth-native \
    ki18n \
    kio \
    kxmlgui \
    knotifications \
    kconfig-native \
    kcoreaddons-native \
    kdoctools-native \
    kross \
    sonnet-native \
    kdbusaddons \
    kcrash \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[sha256sum] = "a4a3e5703d39ae8fe12d2ff832e99b3339ba1c8ec8d2439abeb348e687f1eae9"

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/k*5 \
    ${datadir}/icons \
"

RDEPENDS_${PN} += "translate-toolkit"
