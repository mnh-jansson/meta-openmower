DESCRIPTION = "Slic3r"

LICENSE = "AGPL-3.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=73f1eb20517c55bf9493b7dd6e480788"

DEPENDS = "boost"
RDEPENDS:${PN} += "boost"

SRC_URI = "git://github.com/ClemensElflein/Slic3r.git;protocol=https;branch=master"
SRCREV = "026c1380e0ad12176dd2fc8cdf8f6f181deeb071"
S = "${WORKDIR}/git/"

inherit cmake

FILES_${PN} += "${libdir}/*"

do_configure() {
    cmake ${S}/src/ -DCMAKE_INSTALL_PREFIX=${prefix}
}

do_install() {
    install -d ${D}${libdir}
    install -m 0644 *.a ${D}${libdir}

    install -d ${D}${includedir}
    install -d ${D}${includedir}/Fill
    install -m 0644 ${S}/xs/src/*.hpp ${D}${includedir}
    install -m 0644 ${S}/xs/src/libslic3r/*.hpp ${D}${includedir}
    install -m 0644 ${S}/xs/src/libslic3r/*.h ${D}${includedir}
    install -m 0644 ${S}/xs/src/libslic3r/Fill/*.hpp ${D}${includedir}/Fill
}