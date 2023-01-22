inherit ros_distro_noetic

DESCRIPTION = "Metapackage for xbot_msgs"
AUTHOR = "Martin Jansson"
ROS_AUTHOR = "Clemens Elflein"
HOMEPAGE = "https://github.com/ClemensElflein/xbot_msgs"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e9f98f765562b05cf54c2611bbb0200e"

ROS_CN = "xbot"
ROS_BPN = "xbot_msgs"

DEPENDS = " \
    std-msgs \
    geometry-msgs \
    message-generation \
    catkin-native \
"

RDEPENDS:${PN} = " \
    std-msgs \
    geometry-msgs \
    message-generation \
"


SRC_URI = "git://github.com/ClemensElflein/xbot_msgs.git;protocol=https;branch=main"
SRCREV = "c6883885d200b61d3843fbc00776f53c0eb7503c"
S = "${WORKDIR}/git"

inherit ros_catkin
