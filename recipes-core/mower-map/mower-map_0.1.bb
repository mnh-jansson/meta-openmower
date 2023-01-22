inherit ros_distro_noetic

DESCRIPTION = "Metapackage for mower_map"
AUTHOR = "Martin Jansson"
ROS_AUTHOR = "Clemens Elflein"
HOMEPAGE = "https://github.com/ClemensElflein/OpenMower"
SECTION = "devel"
LICENSE = "CC-BY-SA-4.0"
LIC_FILES_CHKSUM = "file://../../LICENSE;md5=136c671dba2d2f644b882e31c3e289e8"

ROS_CN = "open_mower"
ROS_BPN = "mower_map"

DEPENDS = " \
    roscpp \
    std-msgs \
    geometry-msgs \
    message-generation \
    grid-map-core \
    grid-map-ros \
    grid-map-filters \
    grid-map-cv \
    rosbag \
    tf2-geometry-msgs \
    catkin-native \
"

RDEPENDS:${PN} += " \
    roscpp \
    std-msgs \
    geometry-msgs \
    message-generation \
    grid-map-core \
    grid-map-ros \
    grid-map-filters \
    grid-map-cv \
    rosbag \
    tf2-geometry-msgs \
"

SRC_URI = "git://github.com/ClemensElflein/open_mower_ros.git;protocol=https;branch=main"
SRCREV = "93668e080228f93eb87a0ad89fc785d7848c3d9e"
S = "${WORKDIR}/git/src/mower_map/"

inherit ros_catkin
