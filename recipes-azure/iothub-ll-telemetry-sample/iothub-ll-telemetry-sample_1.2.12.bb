DESCRIPTION = "Microsoft Azure IoT Hub Telemetry Sample"
AUTHOR = "Microsoft Corporation"
HOMEPAGE = "https://github.com/Azure/azure-iot-sdk-c/tree/master/iothub_client/samples/iothub_ll_telemetry_sample"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4283671594edec4c13aeb073c219237a"

SRC_URI = "file://${PN}-${PV}.tar.gz"

PR = "r0"

inherit cmake

DEPENDS = "\
    azure-c-shared-utility \
    azure-iot-sdk-c \
"

S = "${WORKDIR}/${PN}"
B = "${WORKDIR}/build"

do_install() {
    install -d ${D}${bindir}
    install -m 0644 ${B}/iothub_ll_telemetry_sample ${D}${bindir}
}

FILES_${PN} = "\
    ${bindir}/* \
"
