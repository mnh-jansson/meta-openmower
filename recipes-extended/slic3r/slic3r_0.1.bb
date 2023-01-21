DESCRIPTION = "Slic3r"

LICENSE = "AGPL-3.0"
LIC_FILES_CHKSUM = "file://../LICENSE;md5=73f1eb20517c55bf9493b7dd6e480788"

DEPENDS = "boost"
RDEPENDS:${PN} += "boost"

SRC_URI = "git://github.com/ClemensElflein/Slic3r.git;protocol=https;branch=master"
SRCREV = "026c1380e0ad12176dd2fc8cdf8f6f181deeb071"
S = "${WORKDIR}/git/src"

inherit cmake

do_install() {
}