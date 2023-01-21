inherit ros_distro_noetic

DESCRIPTION = "Metapackage for vesc_driver"
AUTHOR = "Martin Jansson <mati.jansson@gmail.com>"
ROS_AUTHOR = "Clemens Elflein"
HOMEPAGE = "https://github.com/ClemensElflein/xesc_ros"
SECTION = "devel"
LICENSE = "Apache-2.0 "
LIC_FILES_CHKSUM = "file://../LICENSE;md5=8cdd70c99f636fcc10efce8b5304e7b1"

ROS_CN = "xesc_ros"
ROS_BPN = "vesc_driver"

DEPENDS = " \
    pluginlib \
    roscpp \
    std-msgs \
    xesc-msgs \
    serial \
    xesc-interface \
    catkin-native \
"

RDEPENDS:${PN} += " \
    pluginlib \
    roscpp \
    std-msgs \
    xesc-msgs \
    serial \
    xesc-interface \
"

SRC_URI = "git://github.com/ClemensElflein/xesc_ros.git;protocol=https;branch=develop"
SRCREV = "f64a935d5f0b1d1c9d96e91c0065e8304190958b"
S = "${WORKDIR}/git/vesc_driver"

do_configure_append() {
    install -d ${S}/include/
    install -d ${S}/include/xesc_interface
    install -m 755 ${WORKDIR}/git/xesc_interface/include/xesc_interface/xesc_interface.h ${S}/include/xesc_interface/
}

inherit ros_catkin
