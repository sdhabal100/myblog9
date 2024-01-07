package com.myblog.myblog9.service.impl;

import com.myblog.myblog9.entity.Post;
import com.myblog.myblog9.paylode.PostDto;
import com.myblog.myblog9.repository.PostRepository;
import com.myblog.myblog9.service.PostService;
import org.springframework.stereotype.Service;

@Service
public class PostServiceimpl implements PostService {

    private PostRepository postRepository;

    public PostServiceimpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }
    @Override
    public PostDto CreatePOst(PostDto postDto) {
        Post post= new Post();
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());
        Post savePost = postRepository.save(post);
        PostDto dto=new PostDto();
        dto.setTitle(savePost.getTitle());
        dto.setDescription(savePost.getDescription());
        dto.setTitle(savePost.getContent());
        return dto;
    }
}
