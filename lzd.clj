#!/usr/bin/env bb

(ns lzd)

(defn show-help
  []
  (println 
   (->> ["lzd is a command line tool to help me with normal things"
         "---"
         "  show-help: show this prompt"]
        (interpose "\n")
        (apply str))))

(defn main
  [[cmd & args]]
  (cond
    (= "show-help" cmd) (show-help))
    :else (show-help))

  (main *command-line-args*)