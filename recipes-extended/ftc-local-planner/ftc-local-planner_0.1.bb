inherit ros_distro_noetic

DESCRIPTION = "Metapackage for ftc_local_planner"
AUTHOR = "Martin Jansson"
ROS_AUTHOR = "Clemens Elflein"
HOMEPAGE = "https://github.com/ClemensElflein/ftc_local_planner"
SECTION = "devel"
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = "file://README.md;beginline=6;endline=30;md5=d24c6f4d54f0156e838f29af79a3bb6b"

ROS_CN = "ftc_local_planner"
ROS_BPN = "ftc_local_planner"

DEPENDS = " \
    costmap-2d \
    dynamic-reconfigure \
    nav-core \
    nav-msgs \
    pluginlib \
    roscpp \
    tf \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
    tf2-eigen \
    geometry-msgs \
    std-msgs \
    message-generation \
    mbf-costmap-core \
    mbf-msgs \
    catkin-native \
"

RDEPENDS:${PN} += " \
    costmap-2d \
    dynamic-reconfigure \
    nav-core \
    nav-msgs \
    pluginlib \
    roscpp \
    tf \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
    tf2-eigen \
    geometry-msgs \
    std-msgs \
    message-generation \
    mbf-costmap-core \
    mbf-msgs \
"

SRC_URI = "git://github.com/ClemensElflein/ftc_local_planner.git;protocol=https;branch=main"
SRCREV = "7f31b3f22fabc1ae6436f1b4a474a89881ea854e"
S = "${WORKDIR}/git"

inherit ros_catkin
