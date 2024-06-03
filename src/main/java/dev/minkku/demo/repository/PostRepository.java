package dev.minkku.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import dev.minkku.demo.model.Post;

public interface PostRepository extends JpaRepository<Post, UUID> {
    
}

// Repository는 class가 아닌 interface로 설정 해야한다.
// Repository를 만들었을 경우 annotation @Repository를 붙여줘야하지만 extends를 했을경우는 생략해도 된다.
// JpaRepository< T, id > 는 어떤 테이블과 그 테이블에 어떤 ID를 사용할 것인지 위와 같이 설정 해준다.
