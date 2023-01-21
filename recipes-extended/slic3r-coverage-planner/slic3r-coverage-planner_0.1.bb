inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Metapackage for slic3r_coverage_planner"
AUTHOR = "Martin Jansson <mati.jansson@gmail.com>"
ROS_AUTHOR = "Clemens Elflein"
HOMEPAGE = "https://github.com/ClemensElflein/slic3r_coverage_planner"
SECTION = "devel"
LICENSE = "AGPL-3.0"
LIC_FILES_CHKSUM = " \
    file://LICENSE;md5=4ae09d45eac4aa08d013b5f2e01c67f6 \
"

ROS_CN = "slic3r_coverage_planner"
ROS_BPN = "slic3r_coverage_planner"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    nav-msgs \
    roscpp \
    std-msgs \
    message-generation \
    tf2 \
    costmap-2d \
    slic3r \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    nav-msgs \
    roscpp \
    std-msgs \
    message-generation \
    tf2 \
    costmap-2d \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

#ROS_BRANCH ?= "branch=release/noetic/rosserial"

SRC_URI = " \
    git://github.com/ClemensElflein/slic3r_coverage_planner.git;protocol=https;branch=main \
"

SRCREV = "1039dd0e3db4e9559e76969fe222f015e249aaba"

S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"


inherit ros_${ROS_BUILD_TYPE}



