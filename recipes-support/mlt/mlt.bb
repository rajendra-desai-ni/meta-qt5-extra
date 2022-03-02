SUMMARY = "MLT Multimedia Framework"
HOMEPAGE = "http://www.mltframework.org"
LICENSE = "GPL-2.0 & LGPL-2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=4b54a1fd55a448865a0b32d41598759d \
    file://GPL;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://GPLv3;md5=d32239bcb673463ab874e80d47fae504 \
"

SRC_URI = "git://github.com/mltframework/mlt.git;branch=master;protocol=https"
SRCREV = "255aa2452282bee3d7ec0c8320f9153f03d7e6c3"
PV = "7.4.0"
S = "${WORKDIR}/git"

inherit cmake_qt5 pkgconfig

DEPENDS += " \
    gtk+ \
    qtbase \
    qtsvg \
    virtual/libx11 \
    pango \
    sox \
    libav \
    libsdl libsdl-image \
    libsdl2 libsdl2-image \
    libexif \
    libsamplerate0 \
    fftw \
    jack \
    ladspa-sdk \
    rubberband \
"

FILES:${PN} += " \
    ${datadir}/mlt-7 \
    ${libdir}/mlt-7 \
"
