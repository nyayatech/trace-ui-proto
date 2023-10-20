(ns mermaid.core
  (:require
   [mermaid.module :as M]))

(defn init! [] 
  (js/console.debug "*** MERMAID DEMO ***\n")
  (M/load-module!))

