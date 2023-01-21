inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Metapackage for xesc_2040_driver"
AUTHOR = "Martin Jansson <mati.jansson@gmail.com>"
ROS_AUTHOR = "Clemens Elflein"
HOMEPAGE = "https://github.com/ClemensElflein/xesc_ros"
SECTION = "devel"
LICENSE = "Apache-2.0 "
LIC_FILES_CHKSUM = "file://../LICENSE;md5=8cdd70c99f636fcc10efce8b5304e7b1"

ROS_CN = "xesc_ros"
ROS_BPN = "xesc_2040_driver"

ROS_BUILD_DEPENDS = " \
    pluginlib \
    roscpp \
    std-msgs \
    serial \
    xesc-msgs \
    xesc-interface \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    pluginlib \
    roscpp \
    std-msgs \
    serial \
    xesc-msgs \
    xesc-interface \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

#ROS_BRANCH ?= "branch=release/noetic/rosserial"
SRC_URI = "git://github.com/ClemensElflein/xesc_ros.git;protocol=https;branch=develop"
SRCREV = "f64a935d5f0b1d1c9d96e91c0065e8304190958b"
S = "${WORKDIR}/git/xesc_2040_driver"


ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
