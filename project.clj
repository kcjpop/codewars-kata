(defproject codewar-kata "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]]
  :profiles {:dev {:plugins [[cider/cider-nrepl "0.10.0"]
                             [lein-cloverage "1.0.6"]]}
             :repl {:dependencies [[org.clojure/tools.nrepl "0.2.12"]]}})
