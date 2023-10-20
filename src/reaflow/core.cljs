(ns reaflow.core
  (:require [reagent.dom.client :as rdom]
            ["reaflow" :refer [Canvas]]))

(defonce root
  (rdom/create-root (js/document.getElementById "app")))

(defn test-canvas []
  [:> Canvas
   {:nodes [{:id "1"
             :text "1"}
            {:id "2"
             :text "2"}]
    :edges [{:id "1-2"
             :from "1"
             :to "2"}]
    :maxHeight 500
    :maxWidth 500}])

(defn test-component []
  [:p "Basic test"
   [test-canvas]])

(defn init! []
  (js/console.debug "*** REAFLOW DEMO ***\n")
  (rdom/render root  [test-component]))

