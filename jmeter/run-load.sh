bin/jmeter.sh -n \
-t /c/Users/aravi/workspace/github/aravinth-sivarasa/demo-github-action/jmeter/default_request.jmx \
-l result \
-Jprotocol=http \
-Jhost=localhost \
-Jport=8080 \
-Jusers=5 \
-Jramp=3 \
-Jloop=1 \
-e -o output