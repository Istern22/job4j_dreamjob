package ru.job4j.dream.store;

import ru.job4j.dream.model.Candidate;
import ru.job4j.dream.model.Post;

public class PsqlMain {
    public static void main(String[] args) {
        Store store = PsqlStore.instOf();
        store.save(new Post(0, "Junior Job"));
        store.save(new Post(0, "Middle Job"));
        store.save(new Post(0, "Senior Job"));
        System.out.println("Все вакансии: ");
        for (Post post : store.findAllPosts()) {
            System.out.println(post.getId() + " " + post.getName());
        }
        System.out.println("Вакансия с индексом 2: " + store.findPostById(2).toString());
        store.save(new Candidate(0, "Junior", 0));
        store.save(new Candidate(0, "Middle", 1));
        store.save(new Candidate(0, "Senior", 2));
        System.out.println("Все кандидаты: ");
        for (Candidate candidate : store.findAllCandidates()) {
            System.out.println(candidate.getId() + " " + candidate.getName());
        }
        System.out.println("Вакансия с индексом 1: " + store.findCandidateById(1).toString());
    }
}