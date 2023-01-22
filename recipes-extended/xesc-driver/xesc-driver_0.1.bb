inherit ros_distro_noetic

DESCRIPTION = "Metapackage for xesc_driver"
AUTHOR = "Martin Jansson"
ROS_AUTHOR = "Clemens Elflein"
HOMEPAGE = "https://github.com/ClemensElflein/xesc_ros"
SECTION = "devel"
LICENSE = "Apache-2.0 "
LIC_FILES_CHKSUM = "file://../LICENSE;md5=8cdd70c99f636fcc10efce8b5304e7b1"

ROS_CN = "xesc_ros"
ROS_BPN = "xesc_driver"

DEPENDS = " \
    pluginlib \
    roscpp \
    std-msgs \
    serial \
    xesc-msgs \
    vesc-driver \
    xesc-2040-driver \
    xesc-interface \
    catkin-native \
"
RDEPENDS:${PN} += " \
    pluginlib \
    roscpp \
    std-msgs \
    serial \
    xesc-msgs \
    vesc-driver \
    xesc-2040-driver \
    xesc-interface \
"

SRC_URI = "git://github.com/ClemensElflein/xesc_ros.git;protocol=https;branch=develop"
SRCREV = "f64a935d5f0b1d1c9d96e91c0065e8304190958b"
S = "${WORKDIR}/git/xesc_driver"

inherit ros_catkin

do_install_append() {
    install -d ${D}${includedir}
    install -d ${D}${includedir}/xesc_driver
    install -m 0644 ${S}/include/xesc_driver/*.h ${D}${includedir}/xesc_driver
}