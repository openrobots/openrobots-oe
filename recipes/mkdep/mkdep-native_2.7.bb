DESCRIPTION = "OpenRobots dependencies generation tool"
LICENSE = "BSD"

S = ${WORKDIR}/mkdep-${PV}

SRC_URI = "ftp://softs.laas.fr/pub/openrobots/mkdep-${PV}.tar.gz;name=archive"
SRC_URI[archive.md5sum] = "8bc9c85955c5fe6f67e4d4cd9c5b8383"
SRC_URI[archive.sha256sum] = "cb6d393fdb4fc5c91152fb02f3cdcab7bf71ca2e697aac09fa25a8f2f146d5ad"

CCACHE = ""

inherit native autotools pkgconfig

