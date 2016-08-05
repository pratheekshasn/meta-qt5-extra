SUMMARY = "Okteta is a simple hex editor"
LICENSE = "GPLv2 & GFDL-1.2 & LGPL-2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
    file://COPYING.DOC;md5=24ea4c7092233849b4394699333b5c56 \
"

inherit kde-apps gtk-icon-cache

DEPENDS += " \
    qca \
    kbookmarks \
    kcodecs \
    kcompletion \
    kconfigwidgets \
    kdbusaddons \
    kdoctools \
    kiconthemes \
    ki18n \
    kcmutils \
    kio \
    knewstuff \
    kparts \
    kservice \
    kwidgetsaddons \
    kxmlgui \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "823fa7de994492b29b9cadfe9983621c"
SRC_URI[sha256sum] = "b034e0ab9f6989012437f790c346deaec2511e764c939a9774fa0fa5bc6bd563"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${datadir}/appdata \
    ${datadir}/config.kcfg \
    ${datadir}/kxmlgui5 \
    ${datadir}/mime \
"