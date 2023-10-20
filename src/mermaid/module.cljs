(ns mermaid.module
  (:require
   [shadow.esm :refer (dynamic-import)]
   [shadow.cljs.modern :refer (js-await)]))

(defonce Mermaid (atom false))

(defn load-module! []
  (js/console.debug "Loading Mermaid module")
  (js-await [mod (dynamic-import "https://unpkg.com/mermaid@10.5.0/dist/mermaid.esm.min.mjs")]
            (reset! Mermaid (.. mod -default))
            (js/console.debug "Mermaid module loaded" @Mermaid)))

(defn instance! [] (deref Mermaid))