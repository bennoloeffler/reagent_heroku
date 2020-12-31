(ns reagent-heroku.prod
  (:require [reagent-heroku.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
