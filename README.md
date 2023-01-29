# `[dunfell]`
# meta-openmower
OpenEmbedded Layer for Openmower - https://github.com/ClemensElflein/open_mower_ros


## Dependencies
This layer depends on:
```
URI: git://github.com/openembedded/meta-openembedded.git
branch: dunfell
revision: HEAD

URI: git://github.com/ros/meta-ros.git
branch: dunfell
revision: HEAD
```
## Usage

* Make a workspace directory and clone all the necessary layers.
<pre><code>
mkdir yocto
cd yocto
git clone --depth 1 git://git.yoctoproject.org/poky -b dunfell
cd poky
git clone --depth 1 https://github.com/openembedded/meta-openembedded.git -b dunfell
git clone --depth 1 https://github.com/ros/meta-ros.git -b dunfell
git clone --depth 1 https://github.com/mnh-jansson/meta-openmower.git -b dunfell

source oe-init-build-env
</code></pre>
* Add the required layers to `conf/bblayers.conf`
<pre><code>
BBLAYERS ?= " \
    ${TOPDIR}/../meta \
    ${TOPDIR}/../meta-poky \
    ${TOPDIR}/../meta-yocto-bsp \
    ${TOPDIR}/../meta-ros/meta-ros1 \
    ${TOPDIR}/../meta-ros/meta-ros1-noetic \
    ${TOPDIR}/../meta-ros/meta-ros-common \
    ${TOPDIR}/../meta-ros/meta-ros-backports-gatesgarth \
    ${TOPDIR}/../meta-ros/meta-ros-backports-hardknott \
    ${TOPDIR}/../meta-openembedded/meta-oe \
    ${TOPDIR}/../meta-openembedded/meta-python \
    ${TOPDIR}/../meta-openembedded/meta-networking \
    ${TOPDIR}/../meta-openmower \
"
</code></pre>
* Set `conf/local.conf` according to your target.
* Build image with:
<pre><code>
bitbake core-image-openmower
</code></pre>


## Contributing

When contributing to this repository, please first discuss the change you wish to make via issue,
email, or any other method with the owners of this repository before making a change. 