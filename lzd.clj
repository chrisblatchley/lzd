#!/usr/bin/env bb
(ns lzd
  (:require [babashka.fs :as fs]))

(defn help []
  (println 
   (->> ["lzd is a command line tool to help me with normal things"
         "---"
         "  help: show this prompt"]
        (interpose "\n")
        (apply str))))

(defn main
  [[cmd & args]]
  (cond
    (= "help" cmd) (help)
    :else (println "run `lzd help` to see all options")))

(main *command-line-args*)