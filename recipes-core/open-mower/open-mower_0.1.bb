inherit ros_distro_noetic

DESCRIPTION = "Metapackage for open_mower"
AUTHOR = "Martin Jansson <mati.jansson@gmail.com>"
ROS_AUTHOR = "Clemens Elflein"
HOMEPAGE = "https://github.com/ClemensElflein/OpenMower"
SECTION = "devel"
LICENSE = "CC-BY-SA-4.0"
LIC_FILES_CHKSUM = "file://../../LICENSE;md5=136c671dba2d2f644b882e31c3e289e8"

ROS_CN = "open_mower"
ROS_BPN = "open_mower"

DEPENDS = " \
    mower-msgs \
    mower-simulation \
    catkin-native \
"

RDEPENDS:${PN} += " \
    mower-msgs \
    mower-simulation \
"

SRC_URI = "git://github.com/ClemensElflein/open_mower_ros.git;protocol=https;branch=main"
SRCREV = "93668e080228f93eb87a0ad89fc785d7848c3d9e"
S = "${WORKDIR}/git/src/open_mower/"

inherit ros_catkin
