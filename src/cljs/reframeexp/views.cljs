(ns reframeexp.views
    (:require [re-frame.core :refer [subscribe dispatch]]))

(defn mybtn []
  [:button {:on-click #(dispatch [:button-clicked])} "clickme"])

(defn main-panel []
  (let [name (subscribe [:name])]
    (fn []
      [:div "Hello from " @name [mybtn]])))
