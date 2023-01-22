inherit ros_distro_noetic

DESCRIPTION = "Metapackage for xbot_driver_gps"
AUTHOR = "Martin Jansson <mati.jansson@gmail.com>"
ROS_AUTHOR = "Clemens Elflein"
HOMEPAGE = "https://github.com/ClemensElflein/xbot_driver_gps"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e9f98f765562b05cf54c2611bbb0200e"

ROS_CN = "xbot"
ROS_BPN = "xbot_driver_gps"

DEPENDS = " \
    geometry-msgs \
    xbot-msgs \
    roscpp \
    serial \
    robot-localization \
    tf2-geometry-msgs \
    tf2 \
    catkin-native \
"

RDEPENDS:${PN} += " \
    geometry-msgs \
    xbot-msgs \
    roscpp \
    serial \
    robot-localization \
    tf2-geometry-msgs \
    tf2 \
"

SRC_URI = "git://github.com/ClemensElflein/xbot_driver_gps.git;protocol=https;branch=main"
SRCREV = "266d3ef6d634d779f34329bda862e46a0cade7b0"
S = "${WORKDIR}/git"

inherit ros_catkin
