import './style.css';
import {ReactComponent as GithubIcon} from 'assets/img/github.svg';

function Navbar() {
    return (
        <header>
            <nav className='container'>
                <div className='dsmovie-nav-content'>
                    <h1>DSMovie</h1>
                    <a href="https://github.com/damaresbortolucci">
                        <div className='dsmovie-contact-container'>
                            <GithubIcon />
                            <p className='dsmovie-contact-link'>/damaresbortolucci</p>
                        </div>
                    </a>
                </div>
            </nav>
      </header>
    )
}

export default Navbar;
