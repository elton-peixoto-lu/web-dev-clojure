(defproject web-dev-clojure "0.1.0-SNAPSHOT"
  :description "My training WEB Clojure Basics"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [ring "1.9.0"]
                 [compojure "1.5.1"]]
  :main web-dev-clojure.core
  :repl-options {:init-ns web-dev-clojure.core})
