(defproject restql-core "2.1.0"
  :description "Microservice query language"
  :url "https://github.com/B2W-Digital/restQL-core"
  :license {:name "MIT"
            :url "http://www.opensource.org/licenses/mit-license.php"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [http-kit "2.2.0"]
                 [org.clojure/tools.logging "0.3.1"]
                 [ring/ring-codec "1.0.1"]
                 [slingshot "0.12.2"]
                 [instaparse "1.4.8"]
                 [prismatic/schema "1.1.7"]
                 [org.clojure/core.async "0.3.443"]
                 [com.fasterxml.jackson.core/jackson-databind "2.8.5"]
                 [cheshire "5.5.0"]
                 [adzerk/bootlaces "0.1.13"]]
  :profiles {:test {:dependencies [[se.haleby/stub-http "0.2.1"]]}
             :uberjar { :aot :all }}
  :plugins [[lein-cloverage "1.0.7-SNAPSHOT"]]
  :source-paths ["src" "src/clj"]
  :resource-paths ["src/resources"]
  :test-paths ["test" "test/clj"]
)