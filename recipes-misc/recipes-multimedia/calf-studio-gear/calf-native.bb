require ${BPN}.inc

inherit autotools pkgconfig native

DEPENDS += " \
    lv2-native \
"

SRC_URI += "file://0001-align-configuration-that-calfmakerdf-is-build-and-in.patch"
