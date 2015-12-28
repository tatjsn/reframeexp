(ns reframeexp.handlers
    (:require [re-frame.core :as re-frame]
              [reframeexp.db :as db]))

(re-frame/register-handler
 :initialize-db
 (fn  [_ _]
   db/default-db))

(re-frame/register-handler
  :button-clicked
  (fn [_ _]
    {:name "clicked"}))