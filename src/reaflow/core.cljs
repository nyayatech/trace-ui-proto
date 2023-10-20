(ns reaflow.core
  (:require [reagent.dom.client :as rdomc]))


(defonce root
  (rdomc/create-root (js/document.getElementById "app")))

(defn test-component []
  [:div [:h2 "test component"]
   [:p "with react create root"]])

(defn init! []
  (js/console.debug "*** REAFLOW DEMO ***\n")
  (let [el (test-component)]
    (rdomc/render root [test-component])))
