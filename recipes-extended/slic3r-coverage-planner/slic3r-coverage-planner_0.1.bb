inherit ros_distro_noetic

DESCRIPTION = "Metapackage for slic3r_coverage_planner"
AUTHOR = "Martin Jansson"
ROS_AUTHOR = "Clemens Elflein"
HOMEPAGE = "https://github.com/ClemensElflein/slic3r_coverage_planner"
SECTION = "devel"
LICENSE = "AGPL-3.0"
LIC_FILES_CHKSUM = " \
    file://LICENSE;md5=4ae09d45eac4aa08d013b5f2e01c67f6 \
"

ROS_CN = "slic3r_coverage_planner"
ROS_BPN = "slic3r_coverage_planner"

DEPENDS = " \
    geometry-msgs \
    nav-msgs \
    roscpp \
    std-msgs \
    message-generation \
    tf2 \
    costmap-2d \
    slic3r \
    catkin-native \
    boost \
"

RDEPENDS:${PN} += " \
    geometry-msgs \
    nav-msgs \
    roscpp \
    std-msgs \
    message-generation \
    tf2 \
    costmap-2d \
"

SRC_URI = " \
    git://github.com/ClemensElflein/slic3r_coverage_planner.git;protocol=https;branch=main \
"
SRCREV = "1039dd0e3db4e9559e76969fe222f015e249aaba"
S = "${WORKDIR}/git"

inherit ros_catkin



