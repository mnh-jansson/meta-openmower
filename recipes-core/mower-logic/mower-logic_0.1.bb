inherit ros_distro_noetic

DESCRIPTION = "Metapackage for mower_logic"
AUTHOR = "Martin Jansson <mati.jansson@gmail.com>"
ROS_AUTHOR = "Clemens Elflein"
HOMEPAGE = "https://github.com/ClemensElflein/OpenMower"
SECTION = "devel"
LICENSE = "CC-BY-SA-4.0"
LIC_FILES_CHKSUM = "file://../../LICENSE;md5=136c671dba2d2f644b882e31c3e289e8"

ROS_CN = "open_mower"
ROS_BPN = "mower_logic"

DEPENDS = " \
    dynamic-reconfigure \
    ftc-local-planner \
    mbf-msgs \
    mower-map \
    mower-msgs \
    nav-msgs \
    roscpp \
    slic3r-coverage-planner \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
    sensor-msgs \
    robot-localization \
    xbot-msgs \
    xbot-positioning \
"

RDEPENDS:${PN} += " \
    dynamic-reconfigure \
    ftc-local-planner \
    mbf-msgs \
    mower-map \
    mower-msgs \
    nav-msgs \
    roscpp \
    slic3r-coverage-planner \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
    sensor-msgs \
    robot-localization \
    xbot-msgs \
    xbot-positioning \
"

SRC_URI = "git://github.com/ClemensElflein/open_mower_ros.git;protocol=https;branch=main"
SRCREV = "93668e080228f93eb87a0ad89fc785d7848c3d9e"
S = "${WORKDIR}/git/src/mower_logic/"

inherit ros_catkin
