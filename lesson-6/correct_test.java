



<!DOCTYPE html>
<html lang="en" class="">
  <head prefix="og: http://ogp.me/ns# fb: http://ogp.me/ns/fb# object: http://ogp.me/ns/object# article: http://ogp.me/ns/article# profile: http://ogp.me/ns/profile#">
    <meta charset='utf-8'>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta http-equiv="Content-Language" content="en">
    <meta name="viewport" content="width=1020">
    
    
    <title>math.uni.lodz.pl/correct_test.java at 363d956d16afee0cd20c314e42a278540765016f · bartlomiejkaftan/math.uni.lodz.pl</title>
    <link rel="search" type="application/opensearchdescription+xml" href="/opensearch.xml" title="GitHub">
    <link rel="fluid-icon" href="https://github.com/fluidicon.png" title="GitHub">
    <link rel="apple-touch-icon" sizes="57x57" href="/apple-touch-icon-114.png">
    <link rel="apple-touch-icon" sizes="114x114" href="/apple-touch-icon-114.png">
    <link rel="apple-touch-icon" sizes="72x72" href="/apple-touch-icon-144.png">
    <link rel="apple-touch-icon" sizes="144x144" href="/apple-touch-icon-144.png">
    <meta property="fb:app_id" content="1401488693436528">

      <meta content="@github" name="twitter:site" /><meta content="summary" name="twitter:card" /><meta content="bartlomiejkaftan/math.uni.lodz.pl" name="twitter:title" /><meta content="math.uni.lodz.pl - testowanie aplikacji" name="twitter:description" /><meta content="https://avatars2.githubusercontent.com/u/8439791?v=3&amp;s=400" name="twitter:image:src" />
      <meta content="GitHub" property="og:site_name" /><meta content="object" property="og:type" /><meta content="https://avatars2.githubusercontent.com/u/8439791?v=3&amp;s=400" property="og:image" /><meta content="bartlomiejkaftan/math.uni.lodz.pl" property="og:title" /><meta content="https://github.com/bartlomiejkaftan/math.uni.lodz.pl" property="og:url" /><meta content="math.uni.lodz.pl - testowanie aplikacji" property="og:description" />
      <meta name="browser-stats-url" content="https://api.github.com/_private/browser/stats">
    <meta name="browser-errors-url" content="https://api.github.com/_private/browser/errors">
    <link rel="assets" href="https://assets-cdn.github.com/">
    <link rel="web-socket" href="wss://live.github.com/_sockets/MTU3MTQ5NzE6NjViYWJmMzY4MjBmYmI3Mzk4MGViMGFiZDkyMWNjNzI6ZjJiZWY2N2FiNTU1ZmMzMTNjOTllZDBjYjNmNmY3YjBlYmEwMmI1OGFmZjVhMGVhODEyNDQ3MTY2OTA1ZTlmZQ==--e7bb4706151d811d17227191ecd4560295b7aa8c">
    <meta name="pjax-timeout" content="1000">
    <link rel="sudo-modal" href="/sessions/sudo_modal">

    <meta name="msapplication-TileImage" content="/windows-tile.png">
    <meta name="msapplication-TileColor" content="#ffffff">
    <meta name="selected-link" value="repo_source" data-pjax-transient>

    <meta name="google-site-verification" content="KT5gs8h0wvaagLKAVWq8bbeNwnZZK1r1XQysX3xurLU">
    <meta name="google-analytics" content="UA-3769691-2">

<meta content="collector.githubapp.com" name="octolytics-host" /><meta content="github" name="octolytics-app-id" /><meta content="1FB72286:0F87:2D8476:5696453B" name="octolytics-dimension-request_id" /><meta content="15714971" name="octolytics-actor-id" /><meta content="bartlomiejkaftan" name="octolytics-actor-login" /><meta content="0f9596151aaa26be7babe214526da93faf476e555350c90606bfc26cf78560df" name="octolytics-actor-hash" />
<meta content="/&lt;user-name&gt;/&lt;repo-name&gt;/blob/show" data-pjax-transient="true" name="analytics-location" />
<meta content="Rails, view, blob#show" data-pjax-transient="true" name="analytics-event" />


  <meta class="js-ga-set" name="dimension1" content="Logged In">



        <meta name="hostname" content="github.com">
    <meta name="user-login" content="bartlomiejkaftan">

        <meta name="expected-hostname" content="github.com">

      <link rel="mask-icon" href="https://assets-cdn.github.com/pinned-octocat.svg" color="#4078c0">
      <link rel="icon" type="image/x-icon" href="https://assets-cdn.github.com/favicon.ico">

    <meta content="ba6a5832af2ba8cdfd10690b1faae2a82402912c" name="form-nonce" />

    <link crossorigin="anonymous" href="https://assets-cdn.github.com/assets/github-2cd8e7b7c650541e94a142c9c10fb231b81455e1777c62510eb9b3402cc220b3.css" integrity="sha256-LNjnt8ZQVB6UoULJwQ+yMbgUVeF3fGJRDrmzQCzCILM=" media="all" rel="stylesheet" />
    <link crossorigin="anonymous" href="https://assets-cdn.github.com/assets/github2-c11005a6d45ee1ef4e164093521773ed34c29ed1f11e2faa2708488033b57391.css" integrity="sha256-wRAFptRe4e9OFkCTUhdz7TTCntHxHi+qJwhIgDO1c5E=" media="all" rel="stylesheet" />
    
    


    <meta http-equiv="x-pjax-version" content="6b62a03c26e65b150ce1665a03ea61a6">

      
  <meta name="description" content="math.uni.lodz.pl - testowanie aplikacji">
  <meta name="go-import" content="github.com/bartlomiejkaftan/math.uni.lodz.pl git https://github.com/bartlomiejkaftan/math.uni.lodz.pl.git">

  <meta content="8439791" name="octolytics-dimension-user_id" /><meta content="bartlomiejkaftan" name="octolytics-dimension-user_login" /><meta content="45666771" name="octolytics-dimension-repository_id" /><meta content="bartlomiejkaftan/math.uni.lodz.pl" name="octolytics-dimension-repository_nwo" /><meta content="true" name="octolytics-dimension-repository_public" /><meta content="true" name="octolytics-dimension-repository_is_fork" /><meta content="44339780" name="octolytics-dimension-repository_parent_id" /><meta content="jacekokrojek/math.uni.lodz.pl" name="octolytics-dimension-repository_parent_nwo" /><meta content="44339780" name="octolytics-dimension-repository_network_root_id" /><meta content="jacekokrojek/math.uni.lodz.pl" name="octolytics-dimension-repository_network_root_nwo" />
  <link href="https://github.com/bartlomiejkaftan/math.uni.lodz.pl/commits/363d956d16afee0cd20c314e42a278540765016f.atom" rel="alternate" title="Recent Commits to math.uni.lodz.pl:363d956d16afee0cd20c314e42a278540765016f" type="application/atom+xml">

  </head>


  <body class="logged_in   env-production windows vis-public fork page-blob">
    <a href="#start-of-content" tabindex="1" class="accessibility-aid js-skip-to-content">Skip to content</a>

    
    
    



      <div class="header header-logged-in true" role="banner">
  <div class="container clearfix">

    <a class="header-logo-invertocat" href="https://github.com/" data-hotkey="g d" aria-label="Homepage" data-ga-click="Header, go to dashboard, icon:logo">
  <span aria-hidden="true" class="mega-octicon octicon-mark-github"></span>
</a>


      <div class="site-search repo-scope js-site-search" role="search">
          <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="/bartlomiejkaftan/math.uni.lodz.pl/search" class="js-site-search-form" data-global-search-url="/search" data-repo-search-url="/bartlomiejkaftan/math.uni.lodz.pl/search" method="get"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /></div>
  <label class="js-chromeless-input-container form-control">
    <div class="scope-badge">This repository</div>
    <input type="text"
      class="js-site-search-focus js-site-search-field is-clearable chromeless-input"
      data-hotkey="s"
      name="q"
      placeholder="Search"
      aria-label="Search this repository"
      data-global-scope-placeholder="Search GitHub"
      data-repo-scope-placeholder="Search"
      tabindex="1"
      autocapitalize="off">
  </label>
</form>
      </div>

      <ul class="header-nav left" role="navigation">
        <li class="header-nav-item">
          <a href="/pulls" class="js-selected-navigation-item header-nav-link" data-ga-click="Header, click, Nav menu - item:pulls context:user" data-hotkey="g p" data-selected-links="/pulls /pulls/assigned /pulls/mentioned /pulls">
            Pull requests
</a>        </li>
        <li class="header-nav-item">
          <a href="/issues" class="js-selected-navigation-item header-nav-link" data-ga-click="Header, click, Nav menu - item:issues context:user" data-hotkey="g i" data-selected-links="/issues /issues/assigned /issues/mentioned /issues">
            Issues
</a>        </li>
          <li class="header-nav-item">
            <a class="header-nav-link" href="https://gist.github.com/" data-ga-click="Header, go to gist, text:gist">Gist</a>
          </li>
      </ul>

    
<ul class="header-nav user-nav right" id="user-links">
  <li class="header-nav-item">
      <span class="js-socket-channel js-updatable-content"
        data-channel="notification-changed:bartlomiejkaftan"
        data-url="/notifications/header">
      <a href="/notifications" aria-label="You have no unread notifications" class="header-nav-link notification-indicator tooltipped tooltipped-s" data-ga-click="Header, go to notifications, icon:read" data-hotkey="g n">
          <span class="mail-status all-read"></span>
          <span aria-hidden="true" class="octicon octicon-bell"></span>
</a>  </span>

  </li>

  <li class="header-nav-item dropdown js-menu-container">
    <a class="header-nav-link tooltipped tooltipped-s js-menu-target" href="/new"
       aria-label="Create new…"
       data-ga-click="Header, create new, icon:add">
      <span aria-hidden="true" class="octicon octicon-plus left"></span>
      <span class="dropdown-caret"></span>
    </a>

    <div class="dropdown-menu-content js-menu-content">
      <ul class="dropdown-menu dropdown-menu-sw">
        
<a class="dropdown-item" href="/new" data-ga-click="Header, create new repository">
  New repository
</a>


  <a class="dropdown-item" href="/organizations/new" data-ga-click="Header, create new organization">
    New organization
  </a>




      </ul>
    </div>
  </li>

  <li class="header-nav-item dropdown js-menu-container">
    <a class="header-nav-link name tooltipped tooltipped-sw js-menu-target" href="/bartlomiejkaftan"
       aria-label="View profile and more"
       data-ga-click="Header, show menu, icon:avatar">
      <img alt="@bartlomiejkaftan" class="avatar" height="20" src="https://avatars1.githubusercontent.com/u/15714971?v=3&amp;s=40" width="20" />
      <span class="dropdown-caret"></span>
    </a>

    <div class="dropdown-menu-content js-menu-content">
      <div class="dropdown-menu  dropdown-menu-sw">
        <div class=" dropdown-header header-nav-current-user css-truncate">
            Signed in as <strong class="css-truncate-target">bartlomiejkaftan</strong>

        </div>


        <div class="dropdown-divider"></div>

          <a class="dropdown-item" href="/bartlomiejkaftan" data-ga-click="Header, go to profile, text:your profile">
            Your profile
          </a>
        <a class="dropdown-item" href="/stars" data-ga-click="Header, go to starred repos, text:your stars">
          Your stars
        </a>
        <a class="dropdown-item" href="/explore" data-ga-click="Header, go to explore, text:explore">
          Explore
        </a>
          <a class="dropdown-item" href="/integrations" data-ga-click="Header, go to integrations, text:integrations">
            Integrations
          </a>
        <a class="dropdown-item" href="https://help.github.com" data-ga-click="Header, go to help, text:help">
          Help
        </a>

          <div class="dropdown-divider"></div>

          <a class="dropdown-item" href="/settings/profile" data-ga-click="Header, go to settings, icon:settings">
            Settings
          </a>

          <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="/logout" class="logout-form" data-form-nonce="ba6a5832af2ba8cdfd10690b1faae2a82402912c" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="YI9GZ8sM2de5nA6oj1pIqyEp9+KhEFE9oaQDkYw3QCMsTw+vfooh5kc9Xk1Z61JLYluCt6iBDVa6xJMUHcP+tg==" /></div>
            <button class="dropdown-item dropdown-signout" data-ga-click="Header, sign out, icon:logout">
              Sign out
            </button>
</form>
      </div>
    </div>
  </li>
</ul>


    
  </div>
</div>

      

      


    <div id="start-of-content" class="accessibility-aid"></div>

      <div id="js-flash-container">
</div>


    <div role="main" class="main-content">
        <div itemscope itemtype="http://schema.org/WebPage">
    <div id="js-repo-pjax-container" class="context-loader-container js-repo-nav-next" data-pjax-container>
      
<div class="pagehead repohead instapaper_ignore readability-menu experiment-repo-nav">
  <div class="container repohead-details-container">

    

<ul class="pagehead-actions">

  <li>
        <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="/notifications/subscribe" class="js-social-container" data-autosubmit="true" data-form-nonce="ba6a5832af2ba8cdfd10690b1faae2a82402912c" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="BeKbuOCiakD6d+/mfkwgVkk94OyxG21BPicofGW5v7laf+XlkJ/YPui4E80Yobn9MW9hKCWXp0KU+OB16DsN+A==" /></div>      <input id="repository_id" name="repository_id" type="hidden" value="45666771" />

        <div class="select-menu js-menu-container js-select-menu">
          <a href="/bartlomiejkaftan/math.uni.lodz.pl/subscription"
            class="btn btn-sm btn-with-count select-menu-button js-menu-target" role="button" tabindex="0" aria-haspopup="true"
            data-ga-click="Repository, click Watch settings, action:blob#show">
            <span class="js-select-button">
              <span aria-hidden="true" class="octicon octicon-eye"></span>
              Watch
            </span>
          </a>
          <a class="social-count js-social-count" href="/bartlomiejkaftan/math.uni.lodz.pl/watchers">
            1
          </a>

        <div class="select-menu-modal-holder">
          <div class="select-menu-modal subscription-menu-modal js-menu-content" aria-hidden="true">
            <div class="select-menu-header">
              <span aria-label="Close" class="octicon octicon-x js-menu-close" role="button"></span>
              <span class="select-menu-title">Notifications</span>
            </div>

              <div class="select-menu-list js-navigation-container" role="menu">

                <div class="select-menu-item js-navigation-item selected" role="menuitem" tabindex="0">
                  <span aria-hidden="true" class="octicon octicon-check select-menu-item-icon"></span>
                  <div class="select-menu-item-text">
                    <input checked="checked" id="do_included" name="do" type="radio" value="included" />
                    <span class="select-menu-item-heading">Not watching</span>
                    <span class="description">Be notified when participating or @mentioned.</span>
                    <span class="js-select-button-text hidden-select-button-text">
                      <span aria-hidden="true" class="octicon octicon-eye"></span>
                      Watch
                    </span>
                  </div>
                </div>

                <div class="select-menu-item js-navigation-item " role="menuitem" tabindex="0">
                  <span aria-hidden="true" class="octicon octicon-check select-menu-item-icon"></span>
                  <div class="select-menu-item-text">
                    <input id="do_subscribed" name="do" type="radio" value="subscribed" />
                    <span class="select-menu-item-heading">Watching</span>
                    <span class="description">Be notified of all conversations.</span>
                    <span class="js-select-button-text hidden-select-button-text">
                      <span aria-hidden="true" class="octicon octicon-eye"></span>
                      Unwatch
                    </span>
                  </div>
                </div>

                <div class="select-menu-item js-navigation-item " role="menuitem" tabindex="0">
                  <span aria-hidden="true" class="octicon octicon-check select-menu-item-icon"></span>
                  <div class="select-menu-item-text">
                    <input id="do_ignore" name="do" type="radio" value="ignore" />
                    <span class="select-menu-item-heading">Ignoring</span>
                    <span class="description">Never be notified.</span>
                    <span class="js-select-button-text hidden-select-button-text">
                      <span aria-hidden="true" class="octicon octicon-mute"></span>
                      Stop ignoring
                    </span>
                  </div>
                </div>

              </div>

            </div>
          </div>
        </div>
</form>
  </li>

  <li>
    
  <div class="js-toggler-container js-social-container starring-container ">

    <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="/bartlomiejkaftan/math.uni.lodz.pl/unstar" class="js-toggler-form starred js-unstar-button" data-form-nonce="ba6a5832af2ba8cdfd10690b1faae2a82402912c" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="WyK35xuE3KNPj97qeGr/rYiw3fMcxDKTTqEY1sPg3aFPb2jMLCyitkwkW+TBfwf0TOBLSxRy3mhyV9/cAVW9Xw==" /></div>
      <button
        class="btn btn-sm btn-with-count js-toggler-target"
        aria-label="Unstar this repository" title="Unstar bartlomiejkaftan/math.uni.lodz.pl"
        data-ga-click="Repository, click unstar button, action:blob#show; text:Unstar">
        <span aria-hidden="true" class="octicon octicon-star"></span>
        Unstar
      </button>
        <a class="social-count js-social-count" href="/bartlomiejkaftan/math.uni.lodz.pl/stargazers">
          0
        </a>
</form>
    <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="/bartlomiejkaftan/math.uni.lodz.pl/star" class="js-toggler-form unstarred js-star-button" data-form-nonce="ba6a5832af2ba8cdfd10690b1faae2a82402912c" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="Tk8xerhRoecHeD5y0pEmcaBovODJ0IO8tPt3Fk+sN5610Gqxretw8yxHe4+vZyP1vWbg1kMZ5NBwPd5NPCVR3A==" /></div>
      <button
        class="btn btn-sm btn-with-count js-toggler-target"
        aria-label="Star this repository" title="Star bartlomiejkaftan/math.uni.lodz.pl"
        data-ga-click="Repository, click star button, action:blob#show; text:Star">
        <span aria-hidden="true" class="octicon octicon-star"></span>
        Star
      </button>
        <a class="social-count js-social-count" href="/bartlomiejkaftan/math.uni.lodz.pl/stargazers">
          0
        </a>
</form>  </div>

  </li>

  <li>
          <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="/bartlomiejkaftan/math.uni.lodz.pl/fork" class="btn-with-count" data-form-nonce="ba6a5832af2ba8cdfd10690b1faae2a82402912c" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="2BzDY8aSFfEGcRzEFpnM4ZI8oOE3Oyiy/vuSTohIrb8b7Xn19bqCLYihQKDrGeNpHvYN43+WENdj8D7uNo5Vvg==" /></div>
            <button
                type="submit"
                class="btn btn-sm btn-with-count"
                data-ga-click="Repository, show fork modal, action:blob#show; text:Fork"
                title="Fork your own copy of bartlomiejkaftan/math.uni.lodz.pl to your account"
                aria-label="Fork your own copy of bartlomiejkaftan/math.uni.lodz.pl to your account">
              <span aria-hidden="true" class="octicon octicon-repo-forked"></span>
              Fork
            </button>
</form>
    <a href="/bartlomiejkaftan/math.uni.lodz.pl/network" class="social-count">
      21
    </a>
  </li>
</ul>

    <h1 itemscope itemtype="http://data-vocabulary.org/Breadcrumb" class="entry-title public ">
  <span aria-hidden="true" class="octicon octicon-repo-forked"></span>
  <span class="author"><a href="/bartlomiejkaftan" class="url fn" itemprop="url" rel="author"><span itemprop="title">bartlomiejkaftan</span></a></span><!--
--><span class="path-divider">/</span><!--
--><strong><a href="/bartlomiejkaftan/math.uni.lodz.pl" data-pjax="#js-repo-pjax-container">math.uni.lodz.pl</a></strong>

  <span class="page-context-loader">
    <img alt="" height="16" src="https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif" width="16" />
  </span>

    <span class="fork-flag">
      <span class="text">forked from <a href="/jacekokrojek/math.uni.lodz.pl">jacekokrojek/math.uni.lodz.pl</a></span>
    </span>
</h1>

  </div>
  <div class="container">
    
<nav class="reponav js-repo-nav js-sidenav-container-pjax js-octicon-loaders"
     role="navigation"
     data-pjax="#js-repo-pjax-container">

  <a href="/bartlomiejkaftan/math.uni.lodz.pl" aria-label="Code" aria-selected="true" class="js-selected-navigation-item selected reponav-item" data-hotkey="g c" data-selected-links="repo_source repo_downloads repo_commits repo_releases repo_tags repo_branches /bartlomiejkaftan/math.uni.lodz.pl">
    <span aria-hidden="true" class="octicon octicon-code"></span>
    Code
</a>

  <a href="/bartlomiejkaftan/math.uni.lodz.pl/pulls" class="js-selected-navigation-item reponav-item" data-hotkey="g p" data-selected-links="repo_pulls /bartlomiejkaftan/math.uni.lodz.pl/pulls">
    <span aria-hidden="true" class="octicon octicon-git-pull-request"></span>
    Pull requests
    <span class="counter">0</span>
</a>
    <a href="/bartlomiejkaftan/math.uni.lodz.pl/wiki" class="js-selected-navigation-item reponav-item" data-hotkey="g w" data-selected-links="repo_wiki /bartlomiejkaftan/math.uni.lodz.pl/wiki">
      <span aria-hidden="true" class="octicon octicon-book"></span>
      Wiki
</a>
  <a href="/bartlomiejkaftan/math.uni.lodz.pl/pulse" class="js-selected-navigation-item reponav-item" data-selected-links="pulse /bartlomiejkaftan/math.uni.lodz.pl/pulse">
    <span aria-hidden="true" class="octicon octicon-pulse"></span>
    Pulse
</a>
  <a href="/bartlomiejkaftan/math.uni.lodz.pl/graphs" class="js-selected-navigation-item reponav-item" data-selected-links="repo_graphs repo_contributors /bartlomiejkaftan/math.uni.lodz.pl/graphs">
    <span aria-hidden="true" class="octicon octicon-graph"></span>
    Graphs
</a>

</nav>

  </div>
</div>

<div class="container new-discussion-timeline experiment-repo-nav">
  <div class="repository-content">

    

<a href="/bartlomiejkaftan/math.uni.lodz.pl/blob/363d956d16afee0cd20c314e42a278540765016f/lesson-6/correct_test.java" class="hidden js-permalink-shortcut" data-hotkey="y">Permalink</a>

<!-- blob contrib key: blob_contributors:v21:58bd3a95e1cd86326d38f102cf49b897 -->

<div class="file-navigation js-zeroclipboard-container">
  
<div class="select-menu js-menu-container js-select-menu left">
  <button class="btn btn-sm select-menu-button js-menu-target css-truncate" data-hotkey="w"
    title=""
    type="button" aria-label="Switch branches or tags" tabindex="0" aria-haspopup="true">
    <i>Tree:</i>
    <span class="js-select-button css-truncate-target">363d956d16</span>
  </button>

  <div class="select-menu-modal-holder js-menu-content js-navigation-container" data-pjax aria-hidden="true">

    <div class="select-menu-modal">
      <div class="select-menu-header">
        <span aria-label="Close" class="octicon octicon-x js-menu-close" role="button"></span>
        <span class="select-menu-title">Switch branches/tags</span>
      </div>

      <div class="select-menu-filters">
        <div class="select-menu-text-filter">
          <input type="text" aria-label="Filter branches/tags" id="context-commitish-filter-field" class="js-filterable-field js-navigation-enable" placeholder="Filter branches/tags">
        </div>
        <div class="select-menu-tabs">
          <ul>
            <li class="select-menu-tab">
              <a href="#" data-tab-filter="branches" data-filter-placeholder="Filter branches/tags" class="js-select-menu-tab" role="tab">Branches</a>
            </li>
            <li class="select-menu-tab">
              <a href="#" data-tab-filter="tags" data-filter-placeholder="Find a tag…" class="js-select-menu-tab" role="tab">Tags</a>
            </li>
          </ul>
        </div>
      </div>

      <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket" data-tab-filter="branches" role="menu">

        <div data-filterable-for="context-commitish-filter-field" data-filterable-type="substring">


            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/bartlomiejkaftan/math.uni.lodz.pl/blob/master/lesson-6/correct_test.java"
               data-name="master"
               data-skip-pjax="true"
               rel="nofollow">
              <span aria-hidden="true" class="octicon octicon-check select-menu-item-icon"></span>
              <span class="select-menu-item-text css-truncate-target" title="master">
                master
              </span>
            </a>
        </div>

          <div class="select-menu-no-results">Nothing to show</div>
      </div>

      <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket" data-tab-filter="tags">
        <div data-filterable-for="context-commitish-filter-field" data-filterable-type="substring">


        </div>

        <div class="select-menu-no-results">Nothing to show</div>
      </div>

    </div>
  </div>
</div>

  <div class="btn-group right">
    <a href="/bartlomiejkaftan/math.uni.lodz.pl/find/363d956d16afee0cd20c314e42a278540765016f"
          class="js-show-file-finder btn btn-sm"
          data-pjax
          data-hotkey="t">
      Find file
    </a>
    <button aria-label="Copy file path to clipboard" class="js-zeroclipboard btn btn-sm zeroclipboard-button tooltipped tooltipped-s" data-copied-hint="Copied!" type="button">Copy path</button>
  </div>
  <div class="breadcrumb js-zeroclipboard-target">
    <span class="repo-root js-repo-root"><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/bartlomiejkaftan/math.uni.lodz.pl/tree/363d956d16afee0cd20c314e42a278540765016f" class="" data-branch="363d956d16afee0cd20c314e42a278540765016f" data-pjax="true" itemscope="url" rel="nofollow"><span itemprop="title">math.uni.lodz.pl</span></a></span></span><span class="separator">/</span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/bartlomiejkaftan/math.uni.lodz.pl/tree/363d956d16afee0cd20c314e42a278540765016f/lesson-6" class="" data-branch="363d956d16afee0cd20c314e42a278540765016f" data-pjax="true" itemscope="url" rel="nofollow"><span itemprop="title">lesson-6</span></a></span><span class="separator">/</span><strong class="final-path">correct_test.java</strong>
  </div>
</div>


  <div class="commit-tease">
      <span class="right">
        <a class="commit-tease-sha" href="/bartlomiejkaftan/math.uni.lodz.pl/commit/363d956d16afee0cd20c314e42a278540765016f" data-pjax>
          363d956
        </a>
        <time datetime="2016-01-10T10:30:49Z" is="relative-time">Jan 10, 2016</time>
      </span>
      <div>
        <img alt="@bartlomiejkaftan" class="avatar" height="20" src="https://avatars0.githubusercontent.com/u/8439791?v=3&amp;s=40" width="20" />
        <a href="/bartlomiejkaftan" class="user-mention" rel="author">bartlomiejkaftan</a>
          <a href="/bartlomiejkaftan/math.uni.lodz.pl/commit/363d956d16afee0cd20c314e42a278540765016f" class="message" data-pjax="true" title="Lekcje 6,7,8,9">Lekcje 6,7,8,9</a>
      </div>

    <div class="commit-tease-contributors">
      <a class="muted-link contributors-toggle" href="#blob_contributors_box" rel="facebox">
        <strong>1</strong>
         contributor
      </a>
      
    </div>

    <div id="blob_contributors_box" style="display:none">
      <h2 class="facebox-header" data-facebox-id="facebox-header">Users who have contributed to this file</h2>
      <ul class="facebox-user-list" data-facebox-id="facebox-description">
          <li class="facebox-user-list-item">
            <img alt="@bartlomiejkaftan" height="24" src="https://avatars2.githubusercontent.com/u/8439791?v=3&amp;s=48" width="24" />
            <a href="/bartlomiejkaftan">bartlomiejkaftan</a>
          </li>
      </ul>
    </div>
  </div>

<div class="file">
  <div class="file-header">
  <div class="file-actions">

    <div class="btn-group">
      <a href="/bartlomiejkaftan/math.uni.lodz.pl/raw/363d956d16afee0cd20c314e42a278540765016f/lesson-6/correct_test.java" class="btn btn-sm " id="raw-url">Raw</a>
        <a href="/bartlomiejkaftan/math.uni.lodz.pl/blame/363d956d16afee0cd20c314e42a278540765016f/lesson-6/correct_test.java" class="btn btn-sm js-update-url-with-hash">Blame</a>
      <a href="/bartlomiejkaftan/math.uni.lodz.pl/commits/363d956d16afee0cd20c314e42a278540765016f/lesson-6/correct_test.java" class="btn btn-sm " rel="nofollow">History</a>
    </div>

        <a class="btn-octicon tooltipped tooltipped-nw"
           aria-label="You must be on a branch to open this file in GitHub Desktop">
            <span aria-hidden="true" class="octicon octicon-device-desktop"></span>
        </a>

        <button type="button" class="btn-octicon disabled tooltipped tooltipped-nw"
          aria-label="You must be on a branch to make or propose changes to this file">
          <span aria-hidden="true" class="octicon octicon-pencil"></span>
        </button>
        <button type="button" class="btn-octicon btn-octicon-danger disabled tooltipped tooltipped-nw"
          aria-label="You must be on a branch to make or propose changes to this file">
          <span aria-hidden="true" class="octicon octicon-trashcan"></span>
        </button>
  </div>

  <div class="file-info">
      73 lines (71 sloc)
      <span class="file-info-divider"></span>
    1.4 KB
  </div>
</div>

  

  <div class="blob-wrapper data type-java">
      <table class="highlight tab-size js-file-line-container" data-tab-size="8">
      <tr>
        <td id="L1" class="blob-num js-line-number" data-line-number="1"></td>
        <td id="LC1" class="blob-code blob-code-inner js-file-line"><span class="pl-k">&lt;</span><span class="pl-k">?</span>xml version<span class="pl-k">=</span><span class="pl-s"><span class="pl-pds">&quot;</span>1.0<span class="pl-pds">&quot;</span></span> encoding<span class="pl-k">=</span><span class="pl-s"><span class="pl-pds">&quot;</span>UTF-8<span class="pl-pds">&quot;</span></span><span class="pl-k">?</span><span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L2" class="blob-num js-line-number" data-line-number="2"></td>
        <td id="LC2" class="blob-code blob-code-inner js-file-line"><span class="pl-k">&lt;</span><span class="pl-k">!</span><span class="pl-c1">DOCTYPE</span> html <span class="pl-c1">PUBLIC</span> <span class="pl-s"><span class="pl-pds">&quot;</span>-//W3C//DTD XHTML 1.0 Strict//EN<span class="pl-pds">&quot;</span></span> <span class="pl-s"><span class="pl-pds">&quot;</span>http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd<span class="pl-pds">&quot;</span></span><span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L3" class="blob-num js-line-number" data-line-number="3"></td>
        <td id="LC3" class="blob-code blob-code-inner js-file-line"><span class="pl-k">&lt;</span>html xmlns<span class="pl-k">=</span><span class="pl-s"><span class="pl-pds">&quot;</span>http://www.w3.org/1999/xhtml<span class="pl-pds">&quot;</span></span> xml<span class="pl-k">:</span>lang<span class="pl-k">=</span><span class="pl-s"><span class="pl-pds">&quot;</span>en<span class="pl-pds">&quot;</span></span> lang<span class="pl-k">=</span><span class="pl-s"><span class="pl-pds">&quot;</span>en<span class="pl-pds">&quot;</span></span><span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L4" class="blob-num js-line-number" data-line-number="4"></td>
        <td id="LC4" class="blob-code blob-code-inner js-file-line"><span class="pl-k">&lt;</span>head profile<span class="pl-k">=</span><span class="pl-s"><span class="pl-pds">&quot;</span>http://selenium-ide.openqa.org/profiles/test-case<span class="pl-pds">&quot;</span></span><span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L5" class="blob-num js-line-number" data-line-number="5"></td>
        <td id="LC5" class="blob-code blob-code-inner js-file-line"><span class="pl-k">&lt;</span>meta http<span class="pl-k">-</span>equiv<span class="pl-k">=</span><span class="pl-s"><span class="pl-pds">&quot;</span>Content-Type<span class="pl-pds">&quot;</span></span> content<span class="pl-k">=</span><span class="pl-s"><span class="pl-pds">&quot;</span>text/html; charset=UTF-8<span class="pl-pds">&quot;</span></span> <span class="pl-k">/</span><span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L6" class="blob-num js-line-number" data-line-number="6"></td>
        <td id="LC6" class="blob-code blob-code-inner js-file-line"><span class="pl-k">&lt;</span>link rel<span class="pl-k">=</span><span class="pl-s"><span class="pl-pds">&quot;</span>selenium.base<span class="pl-pds">&quot;</span></span> href<span class="pl-k">=</span><span class="pl-s"><span class="pl-pds">&quot;</span>http://localhost:8080/<span class="pl-pds">&quot;</span></span> <span class="pl-k">/</span><span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L7" class="blob-num js-line-number" data-line-number="7"></td>
        <td id="LC7" class="blob-code blob-code-inner js-file-line"><span class="pl-k">&lt;</span>title<span class="pl-k">&gt;</span>correct_test<span class="pl-k">&lt;</span><span class="pl-k">/</span>title<span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L8" class="blob-num js-line-number" data-line-number="8"></td>
        <td id="LC8" class="blob-code blob-code-inner js-file-line"><span class="pl-k">&lt;</span><span class="pl-k">/</span>head<span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L9" class="blob-num js-line-number" data-line-number="9"></td>
        <td id="LC9" class="blob-code blob-code-inner js-file-line"><span class="pl-k">&lt;</span>body<span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L10" class="blob-num js-line-number" data-line-number="10"></td>
        <td id="LC10" class="blob-code blob-code-inner js-file-line"><span class="pl-k">&lt;</span>table cellpadding<span class="pl-k">=</span><span class="pl-s"><span class="pl-pds">&quot;</span>1<span class="pl-pds">&quot;</span></span> cellspacing<span class="pl-k">=</span><span class="pl-s"><span class="pl-pds">&quot;</span>1<span class="pl-pds">&quot;</span></span> border<span class="pl-k">=</span><span class="pl-s"><span class="pl-pds">&quot;</span>1<span class="pl-pds">&quot;</span></span><span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L11" class="blob-num js-line-number" data-line-number="11"></td>
        <td id="LC11" class="blob-code blob-code-inner js-file-line"><span class="pl-k">&lt;</span>thead<span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L12" class="blob-num js-line-number" data-line-number="12"></td>
        <td id="LC12" class="blob-code blob-code-inner js-file-line"><span class="pl-k">&lt;</span>tr<span class="pl-k">&gt;&lt;</span>td rowspan<span class="pl-k">=</span><span class="pl-s"><span class="pl-pds">&quot;</span>1<span class="pl-pds">&quot;</span></span> colspan<span class="pl-k">=</span><span class="pl-s"><span class="pl-pds">&quot;</span>3<span class="pl-pds">&quot;</span></span><span class="pl-k">&gt;</span>correct_test<span class="pl-k">&lt;</span><span class="pl-k">/</span>td<span class="pl-k">&gt;&lt;</span><span class="pl-k">/</span>tr<span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L13" class="blob-num js-line-number" data-line-number="13"></td>
        <td id="LC13" class="blob-code blob-code-inner js-file-line"><span class="pl-k">&lt;</span><span class="pl-k">/</span>thead<span class="pl-k">&gt;&lt;</span>tbody<span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L14" class="blob-num js-line-number" data-line-number="14"></td>
        <td id="LC14" class="blob-code blob-code-inner js-file-line"><span class="pl-k">&lt;</span>tr<span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L15" class="blob-num js-line-number" data-line-number="15"></td>
        <td id="LC15" class="blob-code blob-code-inner js-file-line">	<span class="pl-k">&lt;</span>td<span class="pl-k">&gt;</span>open<span class="pl-k">&lt;</span><span class="pl-k">/</span>td<span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L16" class="blob-num js-line-number" data-line-number="16"></td>
        <td id="LC16" class="blob-code blob-code-inner js-file-line">	<span class="pl-k">&lt;</span>td<span class="pl-k">&gt;</span><span class="pl-k">/</span>registrationform<span class="pl-k">/</span><span class="pl-k">&lt;</span><span class="pl-k">/</span>td<span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L17" class="blob-num js-line-number" data-line-number="17"></td>
        <td id="LC17" class="blob-code blob-code-inner js-file-line">	<span class="pl-k">&lt;</span>td<span class="pl-k">&gt;&lt;</span><span class="pl-k">/</span>td<span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L18" class="blob-num js-line-number" data-line-number="18"></td>
        <td id="LC18" class="blob-code blob-code-inner js-file-line"><span class="pl-k">&lt;</span><span class="pl-k">/</span>tr<span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L19" class="blob-num js-line-number" data-line-number="19"></td>
        <td id="LC19" class="blob-code blob-code-inner js-file-line"><span class="pl-k">&lt;</span>tr<span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L20" class="blob-num js-line-number" data-line-number="20"></td>
        <td id="LC20" class="blob-code blob-code-inner js-file-line">	<span class="pl-k">&lt;</span>td<span class="pl-k">&gt;</span>type<span class="pl-k">&lt;</span><span class="pl-k">/</span>td<span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L21" class="blob-num js-line-number" data-line-number="21"></td>
        <td id="LC21" class="blob-code blob-code-inner js-file-line">	<span class="pl-k">&lt;</span>td<span class="pl-k">&gt;</span>name<span class="pl-k">=</span>firstName<span class="pl-k">&lt;</span><span class="pl-k">/</span>td<span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L22" class="blob-num js-line-number" data-line-number="22"></td>
        <td id="LC22" class="blob-code blob-code-inner js-file-line">	<span class="pl-k">&lt;</span>td<span class="pl-k">&gt;</span>qqq<span class="pl-k">&lt;</span><span class="pl-k">/</span>td<span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L23" class="blob-num js-line-number" data-line-number="23"></td>
        <td id="LC23" class="blob-code blob-code-inner js-file-line"><span class="pl-k">&lt;</span><span class="pl-k">/</span>tr<span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L24" class="blob-num js-line-number" data-line-number="24"></td>
        <td id="LC24" class="blob-code blob-code-inner js-file-line"><span class="pl-k">&lt;</span>tr<span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L25" class="blob-num js-line-number" data-line-number="25"></td>
        <td id="LC25" class="blob-code blob-code-inner js-file-line">	<span class="pl-k">&lt;</span>td<span class="pl-k">&gt;</span>type<span class="pl-k">&lt;</span><span class="pl-k">/</span>td<span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L26" class="blob-num js-line-number" data-line-number="26"></td>
        <td id="LC26" class="blob-code blob-code-inner js-file-line">	<span class="pl-k">&lt;</span>td<span class="pl-k">&gt;</span>name<span class="pl-k">=</span>lastName<span class="pl-k">&lt;</span><span class="pl-k">/</span>td<span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L27" class="blob-num js-line-number" data-line-number="27"></td>
        <td id="LC27" class="blob-code blob-code-inner js-file-line">	<span class="pl-k">&lt;</span>td<span class="pl-k">&gt;</span>www<span class="pl-k">&lt;</span><span class="pl-k">/</span>td<span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L28" class="blob-num js-line-number" data-line-number="28"></td>
        <td id="LC28" class="blob-code blob-code-inner js-file-line"><span class="pl-k">&lt;</span><span class="pl-k">/</span>tr<span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L29" class="blob-num js-line-number" data-line-number="29"></td>
        <td id="LC29" class="blob-code blob-code-inner js-file-line"><span class="pl-k">&lt;</span>tr<span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L30" class="blob-num js-line-number" data-line-number="30"></td>
        <td id="LC30" class="blob-code blob-code-inner js-file-line">	<span class="pl-k">&lt;</span>td<span class="pl-k">&gt;</span>type<span class="pl-k">&lt;</span><span class="pl-k">/</span>td<span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L31" class="blob-num js-line-number" data-line-number="31"></td>
        <td id="LC31" class="blob-code blob-code-inner js-file-line">	<span class="pl-k">&lt;</span>td<span class="pl-k">&gt;</span>name<span class="pl-k">=</span>email<span class="pl-k">&lt;</span><span class="pl-k">/</span>td<span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L32" class="blob-num js-line-number" data-line-number="32"></td>
        <td id="LC32" class="blob-code blob-code-inner js-file-line">	<span class="pl-k">&lt;</span>td<span class="pl-k">&gt;</span>as@asss<span class="pl-k">.</span>s<span class="pl-k">&lt;</span><span class="pl-k">/</span>td<span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L33" class="blob-num js-line-number" data-line-number="33"></td>
        <td id="LC33" class="blob-code blob-code-inner js-file-line"><span class="pl-k">&lt;</span><span class="pl-k">/</span>tr<span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L34" class="blob-num js-line-number" data-line-number="34"></td>
        <td id="LC34" class="blob-code blob-code-inner js-file-line"><span class="pl-k">&lt;</span>tr<span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L35" class="blob-num js-line-number" data-line-number="35"></td>
        <td id="LC35" class="blob-code blob-code-inner js-file-line">	<span class="pl-k">&lt;</span>td<span class="pl-k">&gt;</span>type<span class="pl-k">&lt;</span><span class="pl-k">/</span>td<span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L36" class="blob-num js-line-number" data-line-number="36"></td>
        <td id="LC36" class="blob-code blob-code-inner js-file-line">	<span class="pl-k">&lt;</span>td<span class="pl-k">&gt;</span>name<span class="pl-k">=</span>repeatEmail<span class="pl-k">&lt;</span><span class="pl-k">/</span>td<span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L37" class="blob-num js-line-number" data-line-number="37"></td>
        <td id="LC37" class="blob-code blob-code-inner js-file-line">	<span class="pl-k">&lt;</span>td<span class="pl-k">&gt;</span>as@asss<span class="pl-k">.</span>s<span class="pl-k">&lt;</span><span class="pl-k">/</span>td<span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L38" class="blob-num js-line-number" data-line-number="38"></td>
        <td id="LC38" class="blob-code blob-code-inner js-file-line"><span class="pl-k">&lt;</span><span class="pl-k">/</span>tr<span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L39" class="blob-num js-line-number" data-line-number="39"></td>
        <td id="LC39" class="blob-code blob-code-inner js-file-line"><span class="pl-k">&lt;</span>tr<span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L40" class="blob-num js-line-number" data-line-number="40"></td>
        <td id="LC40" class="blob-code blob-code-inner js-file-line">	<span class="pl-k">&lt;</span>td<span class="pl-k">&gt;</span>click<span class="pl-k">&lt;</span><span class="pl-k">/</span>td<span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L41" class="blob-num js-line-number" data-line-number="41"></td>
        <td id="LC41" class="blob-code blob-code-inner js-file-line">	<span class="pl-k">&lt;</span>td<span class="pl-k">&gt;</span>css<span class="pl-k">=</span>button<span class="pl-k">.</span>gwt<span class="pl-k">-</span><span class="pl-k">Button&lt;/</span>td<span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L42" class="blob-num js-line-number" data-line-number="42"></td>
        <td id="LC42" class="blob-code blob-code-inner js-file-line">	<span class="pl-k">&lt;</span>td<span class="pl-k">&gt;&lt;</span><span class="pl-k">/</span>td<span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L43" class="blob-num js-line-number" data-line-number="43"></td>
        <td id="LC43" class="blob-code blob-code-inner js-file-line"><span class="pl-k">&lt;</span><span class="pl-k">/</span>tr<span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L44" class="blob-num js-line-number" data-line-number="44"></td>
        <td id="LC44" class="blob-code blob-code-inner js-file-line"><span class="pl-k">&lt;</span>tr<span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L45" class="blob-num js-line-number" data-line-number="45"></td>
        <td id="LC45" class="blob-code blob-code-inner js-file-line">	<span class="pl-k">&lt;</span>td<span class="pl-k">&gt;</span>click<span class="pl-k">&lt;</span><span class="pl-k">/</span>td<span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L46" class="blob-num js-line-number" data-line-number="46"></td>
        <td id="LC46" class="blob-code blob-code-inner js-file-line">	<span class="pl-k">&lt;</span>td<span class="pl-k">&gt;</span>id<span class="pl-k">=</span>gwt<span class="pl-k">-</span>uid<span class="pl-k">-</span><span class="pl-c1">25</span><span class="pl-k">&lt;</span><span class="pl-k">/</span>td<span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L47" class="blob-num js-line-number" data-line-number="47"></td>
        <td id="LC47" class="blob-code blob-code-inner js-file-line">	<span class="pl-k">&lt;</span>td<span class="pl-k">&gt;&lt;</span><span class="pl-k">/</span>td<span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L48" class="blob-num js-line-number" data-line-number="48"></td>
        <td id="LC48" class="blob-code blob-code-inner js-file-line"><span class="pl-k">&lt;</span><span class="pl-k">/</span>tr<span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L49" class="blob-num js-line-number" data-line-number="49"></td>
        <td id="LC49" class="blob-code blob-code-inner js-file-line"><span class="pl-k">&lt;</span>tr<span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L50" class="blob-num js-line-number" data-line-number="50"></td>
        <td id="LC50" class="blob-code blob-code-inner js-file-line">	<span class="pl-k">&lt;</span>td<span class="pl-k">&gt;</span>click<span class="pl-k">&lt;</span><span class="pl-k">/</span>td<span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L51" class="blob-num js-line-number" data-line-number="51"></td>
        <td id="LC51" class="blob-code blob-code-inner js-file-line">	<span class="pl-k">&lt;</span>td<span class="pl-k">&gt;</span>id<span class="pl-k">=</span>gwt<span class="pl-k">-</span>uid<span class="pl-k">-</span><span class="pl-c1">26</span><span class="pl-k">&lt;</span><span class="pl-k">/</span>td<span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L52" class="blob-num js-line-number" data-line-number="52"></td>
        <td id="LC52" class="blob-code blob-code-inner js-file-line">	<span class="pl-k">&lt;</span>td<span class="pl-k">&gt;&lt;</span><span class="pl-k">/</span>td<span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L53" class="blob-num js-line-number" data-line-number="53"></td>
        <td id="LC53" class="blob-code blob-code-inner js-file-line"><span class="pl-k">&lt;</span><span class="pl-k">/</span>tr<span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L54" class="blob-num js-line-number" data-line-number="54"></td>
        <td id="LC54" class="blob-code blob-code-inner js-file-line"><span class="pl-k">&lt;</span>tr<span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L55" class="blob-num js-line-number" data-line-number="55"></td>
        <td id="LC55" class="blob-code blob-code-inner js-file-line">	<span class="pl-k">&lt;</span>td<span class="pl-k">&gt;</span>click<span class="pl-k">&lt;</span><span class="pl-k">/</span>td<span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L56" class="blob-num js-line-number" data-line-number="56"></td>
        <td id="LC56" class="blob-code blob-code-inner js-file-line">	<span class="pl-k">&lt;</span>td<span class="pl-k">&gt;</span>css<span class="pl-k">=</span>table<span class="pl-k">.</span>form<span class="pl-k">-</span>buttons <span class="pl-k">&amp;</span>gt; tbody <span class="pl-k">&amp;</span>gt; tr <span class="pl-k">&amp;</span>gt; td <span class="pl-k">&amp;</span>gt; button<span class="pl-k">.</span>gwt<span class="pl-k">-</span><span class="pl-k">Button&lt;/</span>td<span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L57" class="blob-num js-line-number" data-line-number="57"></td>
        <td id="LC57" class="blob-code blob-code-inner js-file-line">	<span class="pl-k">&lt;</span>td<span class="pl-k">&gt;&lt;</span><span class="pl-k">/</span>td<span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L58" class="blob-num js-line-number" data-line-number="58"></td>
        <td id="LC58" class="blob-code blob-code-inner js-file-line"><span class="pl-k">&lt;</span><span class="pl-k">/</span>tr<span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L59" class="blob-num js-line-number" data-line-number="59"></td>
        <td id="LC59" class="blob-code blob-code-inner js-file-line"><span class="pl-k">&lt;</span>tr<span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L60" class="blob-num js-line-number" data-line-number="60"></td>
        <td id="LC60" class="blob-code blob-code-inner js-file-line">	<span class="pl-k">&lt;</span>td<span class="pl-k">&gt;</span>selectWindow<span class="pl-k">&lt;</span><span class="pl-k">/</span>td<span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L61" class="blob-num js-line-number" data-line-number="61"></td>
        <td id="LC61" class="blob-code blob-code-inner js-file-line">	<span class="pl-k">&lt;</span>td<span class="pl-k">&gt;</span><span class="pl-c1">null</span><span class="pl-k">&lt;</span><span class="pl-k">/</span>td<span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L62" class="blob-num js-line-number" data-line-number="62"></td>
        <td id="LC62" class="blob-code blob-code-inner js-file-line">	<span class="pl-k">&lt;</span>td<span class="pl-k">&gt;&lt;</span><span class="pl-k">/</span>td<span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L63" class="blob-num js-line-number" data-line-number="63"></td>
        <td id="LC63" class="blob-code blob-code-inner js-file-line"><span class="pl-k">&lt;</span><span class="pl-k">/</span>tr<span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L64" class="blob-num js-line-number" data-line-number="64"></td>
        <td id="LC64" class="blob-code blob-code-inner js-file-line"><span class="pl-k">&lt;</span>tr<span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L65" class="blob-num js-line-number" data-line-number="65"></td>
        <td id="LC65" class="blob-code blob-code-inner js-file-line">	<span class="pl-k">&lt;</span>td<span class="pl-k">&gt;</span>assertText<span class="pl-k">&lt;</span><span class="pl-k">/</span>td<span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L66" class="blob-num js-line-number" data-line-number="66"></td>
        <td id="LC66" class="blob-code blob-code-inner js-file-line">	<span class="pl-k">&lt;</span>td<span class="pl-k">&gt;</span>css<span class="pl-k">=</span><span class="pl-k">div.GOFRIDJCEI&lt;/</span>td<span class="pl-k">&gt;</span></td>
      </tr>
      <tr>
        <td id="L67" class="blob-num js-line-number" data-line-number="67"></td>
        <td id="LC67" class="blob-code blob-code-inner js-file-line">	<span class="pl-k">&lt;</span>td<span class="pl-k">&gt;</span><span class="pl-smi">Congratulations</span><span class="pl-k">!</span> <span class="pl-smi">You</span><span class="pl-s"><span class="pl-pds">&#39;</span>ve won:&lt;/td&gt;</span></td>
      </tr>
      <tr>
        <td id="L68" class="blob-num js-line-number" data-line-number="68"></td>
        <td id="LC68" class="blob-code blob-code-inner js-file-line"><span class="pl-s">&lt;/tr&gt;</span></td>
      </tr>
      <tr>
        <td id="L69" class="blob-num js-line-number" data-line-number="69"></td>
        <td id="LC69" class="blob-code blob-code-inner js-file-line"><span class="pl-s"></span></td>
      </tr>
      <tr>
        <td id="L70" class="blob-num js-line-number" data-line-number="70"></td>
        <td id="LC70" class="blob-code blob-code-inner js-file-line"><span class="pl-s">&lt;/tbody&gt;&lt;/table&gt;</span></td>
      </tr>
      <tr>
        <td id="L71" class="blob-num js-line-number" data-line-number="71"></td>
        <td id="LC71" class="blob-code blob-code-inner js-file-line"><span class="pl-s">&lt;/body&gt;</span></td>
      </tr>
      <tr>
        <td id="L72" class="blob-num js-line-number" data-line-number="72"></td>
        <td id="LC72" class="blob-code blob-code-inner js-file-line"><span class="pl-s">&lt;/html&gt;</span></td>
      </tr>
</table>

  </div>

</div>

<a href="#jump-to-line" rel="facebox[.linejump]" data-hotkey="l" style="display:none">Jump to Line</a>
<div id="jump-to-line" style="display:none">
  <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="" class="js-jump-to-line-form" method="get"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /></div>
    <input class="linejump-input js-jump-to-line-field" type="text" placeholder="Jump to line&hellip;" aria-label="Jump to line" autofocus>
    <button type="submit" class="btn">Go</button>
</form></div>

  </div>
  <div class="modal-backdrop"></div>
</div>

    </div>
  </div>

    </div>

        <div class="container">
  <div class="site-footer" role="contentinfo">
    <ul class="site-footer-links right">
        <li><a href="https://status.github.com/" data-ga-click="Footer, go to status, text:status">Status</a></li>
      <li><a href="https://developer.github.com" data-ga-click="Footer, go to api, text:api">API</a></li>
      <li><a href="https://training.github.com" data-ga-click="Footer, go to training, text:training">Training</a></li>
      <li><a href="https://shop.github.com" data-ga-click="Footer, go to shop, text:shop">Shop</a></li>
        <li><a href="https://github.com/blog" data-ga-click="Footer, go to blog, text:blog">Blog</a></li>
        <li><a href="https://github.com/about" data-ga-click="Footer, go to about, text:about">About</a></li>
        <li><a href="https://github.com/pricing" data-ga-click="Footer, go to pricing, text:pricing">Pricing</a></li>

    </ul>

    <a href="https://github.com" aria-label="Homepage">
      <span aria-hidden="true" class="mega-octicon octicon-mark-github" title="GitHub "></span>
</a>
    <ul class="site-footer-links">
      <li>&copy; 2016 <span title="0.08129s from github-fe134-cp1-prd.iad.github.net">GitHub</span>, Inc.</li>
        <li><a href="https://github.com/site/terms" data-ga-click="Footer, go to terms, text:terms">Terms</a></li>
        <li><a href="https://github.com/site/privacy" data-ga-click="Footer, go to privacy, text:privacy">Privacy</a></li>
        <li><a href="https://github.com/security" data-ga-click="Footer, go to security, text:security">Security</a></li>
        <li><a href="https://github.com/contact" data-ga-click="Footer, go to contact, text:contact">Contact</a></li>
        <li><a href="https://help.github.com" data-ga-click="Footer, go to help, text:help">Help</a></li>
    </ul>
  </div>
</div>



    
    
    

    <div id="ajax-error-message" class="flash flash-error">
      <span aria-hidden="true" class="octicon octicon-alert"></span>
      <button type="button" class="flash-close js-flash-close js-ajax-error-dismiss" aria-label="Dismiss error">
        <span aria-hidden="true" class="octicon octicon-x"></span>
      </button>
      Something went wrong with that request. Please try again.
    </div>


      <script crossorigin="anonymous" integrity="sha256-ZSErq0jgJG8fk+N32pvDLUmXK1/0ug2Slk/8usPyF24=" src="https://assets-cdn.github.com/assets/frameworks-65212bab48e0246f1f93e377da9bc32d49972b5ff4ba0d92964ffcbac3f2176e.js"></script>
      <script async="async" crossorigin="anonymous" integrity="sha256-CvFxyblsJD/HM+Kgc5V2/FSf2QaHdFDxffUKsYidoow=" src="https://assets-cdn.github.com/assets/github-0af171c9b96c243fc733e2a0739576fc549fd906877450f17df50ab1889da28c.js"></script>
      
      
      
    <div class="js-stale-session-flash stale-session-flash flash flash-warn flash-banner hidden">
      <span aria-hidden="true" class="octicon octicon-alert"></span>
      <span class="signed-in-tab-flash">You signed in with another tab or window. <a href="">Reload</a> to refresh your session.</span>
      <span class="signed-out-tab-flash">You signed out in another tab or window. <a href="">Reload</a> to refresh your session.</span>
    </div>
  </body>
</html>

