.PHONY: build
cloud-run=$(shell docker images --filter=reference="*wxcloudrun*" -q)
version=$(shell date '+%Y%m%d%H%M')
build:
ifeq ($(strip $(test-api_image)),)
	@echo "nope"
else
	docker rmi -f ${cloud-run}
endif
	mvn -s ./.mvn/settings.xml -DskipTests=true clean package
	docker build . -t cloud-run/${version}
package:
	mvn -s ./.mvn/settings.xml -DskipTests=true clean package