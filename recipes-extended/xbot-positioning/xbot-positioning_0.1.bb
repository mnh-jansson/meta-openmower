inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Metapackage for xbot_positioning"
AUTHOR = "Martin Jansson <mati.jansson@gmail.com>"
ROS_AUTHOR = "Clemens Elflein"
HOMEPAGE = "https://github.com/ClemensElflein/xbot_positioning"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e9f98f765562b05cf54c2611bbb0200e"

ROS_CN = "xbot"
ROS_BPN = "xbot_positioning"

ROS_BUILD_DEPENDS = " \
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

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
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

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

#ROS_BRANCH ?= "branch=release/noetic/rosserial"
SRC_URI = "git://github.com/ClemensElflein/xbot_positioning.git;protocol=https;branch=main"
SRCREV = "42c53530e4f67de46aa8d3a654c800e188dd9680"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
