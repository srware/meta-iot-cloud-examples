FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

OISP_CONFIG = "${WORKDIR}/config.json"

SRC_URI += "\
    file://config.json \
"
