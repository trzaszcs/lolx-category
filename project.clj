(defproject lolx-category "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [compojure "1.5.1"]
                 [ring/ring-defaults "0.2.1"]
                 [ring/ring-json "0.4.0"]
                 [digest "1.4.4"]
                 [clj-jwt "0.1.1"]
                 [ring/ring-jetty-adapter "1.4.0"]
                 [clj-http "3.1.0"]
                 [camel-snake-kebab "0.4.0"]
                 [environ "1.1.0"]]
  :plugins [[lein-ring "0.9.7"]
            [lein-midje "3.1.3"]
            [lein-environ "1.1.0"]]
  :ring {:handler lolx-category.handler/app}
  :uberjar-name "lolx-category-standalone.jar"
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.3.0"]
                        [midje "1.6.3"]]}})
