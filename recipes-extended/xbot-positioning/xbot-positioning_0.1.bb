inherit ros_distro_noetic

DESCRIPTION = "Metapackage for xbot_positioning"
AUTHOR = "Martin Jansson <mati.jansson@gmail.com>"
ROS_AUTHOR = "Clemens Elflein"
HOMEPAGE = "https://github.com/ClemensElflein/xbot_positioning"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e9f98f765562b05cf54c2611bbb0200e"

ROS_CN = "xbot"
ROS_BPN = "xbot_positioning"

DEPENDS = " \
    geometry-msgs \
    xbot-msgs \
    roscpp \
    tf2-geometry-msgs \
    tf2 \
    tf2-ros \
    message-generation \
    sensor-msgs \
    nav-msgs \
    catkin-native \
"

RDEPENDS:${PN} += " \
    geometry-msgs \
    xbot-msgs \
    roscpp \
    tf2-geometry-msgs \
    tf2 \
    tf2-ros \
    message-generation \
    sensor-msgs \
    nav-msgs \
"

SRC_URI = "git://github.com/ClemensElflein/xbot_positioning.git;protocol=https;branch=main"
SRCREV = "42c53530e4f67de46aa8d3a654c800e188dd9680"
S = "${WORKDIR}/git"

inherit ros_catkin
