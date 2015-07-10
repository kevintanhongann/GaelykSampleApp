def cacheTime = localMode ? 0 : 1.hour


get "/", forward: "/WEB-INF/pages/index.gtpl"
get "/datetime", forward: "/datetime.groovy"

get "/favicon.ico", redirect: "/images/gaelyk-small-favicon.png"

get "/person/list", forward: "/listpeople.groovy"

post "/person/create", forward: "/savepeople.groovy"


