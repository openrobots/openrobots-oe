DESCRIPTION = "OpenRobots dependencies generation tool"
LICENSE = "BSD"

S = ${WORKDIR}/mkdep-${PV}

SRC_URI = "ftp://softs.laas.fr/pub/openrobots/mkdep-${PV}.tar.gz;name=archive"
SRC_URI[archive.md5sum] = "032844173f329fd43f54c34131b6c63a"
SRC_URI[archive.sha256sum] = "6e52e18b22a3852fd801a29a29d2c759af52ba9fcdd6f36a43c0321da848da92"

CCACHE = ""

inherit native autotools pkgconfig

